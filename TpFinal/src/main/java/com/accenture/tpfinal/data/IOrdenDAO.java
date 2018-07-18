package com.accenture.tpfinal.data;

import java.util.List;

import com.accenture.tpfinal.model.Orden;

public interface IOrdenDAO
{
	/*R*/
	public Orden getOrden(Long id);

	public List<Orden> listOrden();
	
	/* CUD */
	public void addOrden(Orden orden);
	
	public void updateOrden(Orden orden);
	
	public void removeOrden(long id);
}
