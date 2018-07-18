package com.accenture.tpfinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OrdenRepuesto")
@IdClass(OrdenRepuestosPK.class)
public class OrdenRepuesto
{

	@Id
	@ManyToOne
	@JoinColumn(name="idOrden")
	private Orden orden;

	@Id
	@ManyToOne
	@JoinColumn(name="idRepuestos")
	private Repuestos repuesto;

	private int cantidad;

	public Orden getOrden() {
		return orden;
	}

	public void setOrden(Orden orden) {
		this.orden = orden;
	}

	public Repuestos getRepuesto() {
		return repuesto;
	}

	public void setRepuesto(Repuestos repuesto) {
		this.repuesto = repuesto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
}
