package com.accenture.tpfinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.tpfinal.data.IPropietarioDAO;
import com.accenture.tpfinal.model.Empleado;
import com.accenture.tpfinal.model.Propietario;


@Controller
@RequestMapping("Propietarios")
public class PropietarioController 
{
	@Autowired
	IPropietarioDAO propietarioDAO;
	
	@RequestMapping("/")
	public ModelAndView Lista(){
		List<Propietario> listaProp = propietarioDAO.listPropietario();
		return new ModelAndView("Propietarios/Lista","listaProp", listaProp);
	}
	

	@RequestMapping("Nuevo")
	public ModelAndView Nuevo(){
		//Nuevo MaV con View
		ModelAndView prop = new ModelAndView("Propietarios/Nuevo");
		//Agrego los modelos
		prop.addObject("propietario", new Propietario());
		prop.addObject("listaProp", propietarioDAO.listPropietario());
		return prop;
	}
	
	@RequestMapping(path="Nuevo", method=RequestMethod.POST)
	public String AltaPropietario(@ModelAttribute("propietario")Propietario p){
		propietarioDAO.addPropietario(p);
		return "redirect:/Propietarios/";
	}
	
	
}
