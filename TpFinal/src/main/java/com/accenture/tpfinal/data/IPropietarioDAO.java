package com.accenture.tpfinal.data;

import java.util.List;

import com.accenture.tpfinal.model.Propietario;
	
public interface IPropietarioDAO 
{
	/*R*/
	public Propietario getPropietario(long dni);

	public List<Propietario> listPropietario();
	
	/* CUD */
	public void addPropietario(Propietario prop);
	
	public void updatePropietario(Propietario prop);
	
	public void removePropietario(long dni);
}
