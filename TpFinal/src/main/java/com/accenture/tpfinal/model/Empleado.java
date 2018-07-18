package com.accenture.tpfinal.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy=false)
public class Empleado
{
	@Id
	private int dni;
	
	private String nombre;
	private String apellido;
	
	@OneToMany(cascade=CascadeType.REMOVE, orphanRemoval=true, mappedBy="empleado")
	private List<Orden> listaOrden;
	
	public Empleado()
	{
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public List<Orden> getListaOrden() {
		return listaOrden;
	}

	public void setListaOrden(List<Orden> listaOrden) {
		this.listaOrden = listaOrden;
	}
	
}
