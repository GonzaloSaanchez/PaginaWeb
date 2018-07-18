package com.accenture.tpfinal.model;
import javax.persistence.*;

@Embeddable
public class OrdenRepuestosPK implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private int idOrden;
	private int idRepuestos;
	
	public int getIdOrden() {
		return idOrden;
	}
	public void setIdOrden(int idOrden) {
		this.idOrden = idOrden;
	}
	public int getIdRepuestos() {
		return idRepuestos;
	}
	public void setIdRepuestos(int idRepuestos) {
		this.idRepuestos = idRepuestos;
	}

}