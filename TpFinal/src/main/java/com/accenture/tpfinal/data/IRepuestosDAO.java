package com.accenture.tpfinal.data;

import java.util.List;


import com.accenture.tpfinal.controller.RepuestosController;
import com.accenture.tpfinal.model.Repuestos;

public interface IRepuestosDAO 
{
	/*R*/
	public Repuestos getRepuesto(Long id);

	public List<Repuestos> listRepuesto();
	
	/* CUD */
	public void addRepuesto(Repuestos repuesto);
	
	public void updateRepuesto(Repuestos repuesto);
	
	public void removeRepuesto(long id);
}
