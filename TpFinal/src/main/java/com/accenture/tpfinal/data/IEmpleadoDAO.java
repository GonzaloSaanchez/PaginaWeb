package com.accenture.tpfinal.data;

import java.util.List;

import com.accenture.tpfinal.model.Auto;
import com.accenture.tpfinal.model.Empleado;

public interface IEmpleadoDAO
{
	/*R*/
	public Empleado getEmpleado(Long dni);
	

	public List<Empleado> listEmpleado();
	
	/* CUD */
	public void addEmpleado(Empleado empleado);
	
	public void updateEmpleado(Empleado empleado);
	
	public void removeEmpleado(long dni);
}
