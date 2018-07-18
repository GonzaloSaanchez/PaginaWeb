package com.accenture.tpfinal.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.accenture.tpfinal.data.IAutoDAO;
import com.accenture.tpfinal.data.IPropietarioDAO;
import com.accenture.tpfinal.model.Auto;

@Controller
@RequestMapping("Autos")
public class AutoController
{
	
	@Autowired
	IAutoDAO autoDAO;
	
	@Autowired
	IPropietarioDAO propietarioDAO;

	@RequestMapping("/")
	public ModelAndView Lista(){
		List<Auto> listaAut = autoDAO.listAuto();
		return new ModelAndView("Autos/Lista","listaAutos", listaAut);
	}
	
	@RequestMapping("Nuevo")
	public ModelAndView Nuevo(){
		//Nuevo MaV con View
		ModelAndView m = new ModelAndView("Autos/Nuevo");
		//Agrego los modelos
		m.addObject("auto", new Auto());
		m.addObject("listaAutos", autoDAO.listAuto());
		m.addObject("listaPropietarios", propietarioDAO.listPropietario());
		return m;
	}
	
	@RequestMapping(path="Nuevo", method=RequestMethod.POST)
	public String AltaAuto(@ModelAttribute("auto")Auto a){
		autoDAO.addAuto(a);
		return "redirect:/Autos/";
	}

	@RequestMapping("Update")
	public ModelAndView Update(){
		//Nuevo MaV con View
		ModelAndView n = new ModelAndView("Autos/Update");
		//Agrego los modelos
		n.addObject("auto", new Auto());
		n.addObject("listaAutos", autoDAO.listAuto());
		return n;
	}
	
	@RequestMapping(path="Update", method=RequestMethod.POST)
	public String UpdateAuto(@ModelAttribute("auto")Auto n){
		autoDAO.updateAuto(n);
		return "redirect:/Autos/";
	}
	
}
