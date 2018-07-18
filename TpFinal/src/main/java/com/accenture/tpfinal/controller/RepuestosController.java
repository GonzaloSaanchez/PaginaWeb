package com.accenture.tpfinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.tpfinal.data.IRepuestosDAO;
import com.accenture.tpfinal.model.Repuestos;


@Controller
@RequestMapping("Repuestos")
public class RepuestosController
{
	
	@Autowired
	IRepuestosDAO repuestoDAO;

	@RequestMapping("/")
	public ModelAndView Lista(){
		List<Repuestos> listaRepuestos = repuestoDAO.listRepuesto();
		return new ModelAndView("Repuestos/Lista","listaRepuestos", listaRepuestos);
	}
	
}

