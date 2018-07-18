package com.accenture.tpfinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.tpfinal.data.IEmpleadoDAO;
import com.accenture.tpfinal.model.Empleado;

@Controller
@RequestMapping("Empleados")
public class EmpleadoController
{
	
	@Autowired
	IEmpleadoDAO empleadoDAO;

	@RequestMapping("/")
	public ModelAndView Lista(){
		List<Empleado> listaEmpleados = empleadoDAO.listEmpleado();
		return new ModelAndView("Empleados/Lista","listaEmpleados", listaEmpleados);
	}
	
	
	@RequestMapping("Nuevo")
	public ModelAndView Nuevo(){
		//Nuevo MaV con View
		ModelAndView m = new ModelAndView("Empleados/Nuevo");
		//Agrego los modelos
		m.addObject("empleado", new Empleado());
		m.addObject("listaEmpleados", empleadoDAO.listEmpleado());
		return m;
	}
	
	@RequestMapping(path="Nuevo", method=RequestMethod.POST)
	public String AltaEmpleado(@ModelAttribute("empleado")Empleado e){
		empleadoDAO.addEmpleado(e);
		return "redirect:/Empleados/";
	}
	
}
