package com.accenture.tpfinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accenture.tpfinal.data.IPropietarioDAO;

@Controller
public class SharedController
{

//	@Autowired
//	IPropietarioDAO propietarioDAO;

	@RequestMapping("/")
	public String Index(){
		return "Index";
	}
	/*
	@RequestMapping("Departamento/Delete/{id}")
	public String DptoDel(@PathVariable("id")String id){
		propietarioDAO.removePropietario(Long.parseLong(id));
		return "redirect:/";
	}
	*/
}
