package com.accenture.tpfinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.tpfinal.data.IAutoDAO;
import com.accenture.tpfinal.data.IEmpleadoDAO;
import com.accenture.tpfinal.data.IOrdenDAO;
import com.accenture.tpfinal.model.Auto;
import com.accenture.tpfinal.model.Orden;


@Controller
@RequestMapping("Ordenes")
public class OrdenController 
{
	@Autowired
	IOrdenDAO ordenDAO;
	
	@Autowired
	IEmpleadoDAO empleadoDAO;
	
	@Autowired
	IAutoDAO autoDAO;



	@RequestMapping("/")
	public ModelAndView Lista(){
		List<Orden> listaOrdenes = ordenDAO.listOrden();
		return new ModelAndView("Ordenes/Lista","listaOrdenes", listaOrdenes);
	}
	
	@RequestMapping("Nuevo")
	public ModelAndView Nuevo(){
		//Nuevo MaV con View
		ModelAndView m = new ModelAndView("Ordenes/Nuevo");
		//Agrego los modelos
		m.addObject("orden", new Orden());
		m.addObject("listaOrdenes", ordenDAO.listOrden());
		m.addObject("listaEmpleados", empleadoDAO.listEmpleado());
		m.addObject("listaAutos", autoDAO.listAuto());
		return m;
	}
	
	@RequestMapping(path="Nuevo", method=RequestMethod.POST)
	public String AltaOrden(@ModelAttribute("orden")Orden o){
		ordenDAO.addOrden(o);
		return "redirect:/Ordenes/";
	}
}
