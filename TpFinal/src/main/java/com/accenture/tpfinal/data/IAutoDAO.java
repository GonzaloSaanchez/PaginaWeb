package com.accenture.tpfinal.data;

import java.util.List;

import com.accenture.tpfinal.model.Auto;


public interface IAutoDAO {

	/*R*/
	public Auto getAuto(Long patente);

	public List<Auto> listAuto();
	
	/* CUD */
	public void addAuto(Auto auto);
	
	public void updateAuto(Auto auto);
	
	public void removeAuto(long patente);
}
