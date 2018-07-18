package com.accenture.tpfinal.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Proxy;



@Entity
@Proxy(lazy=false)
public class Propietario
{

	@Id
	private long dni;
	
	private String nombre,apellido,direccion,telefono;

		@OneToMany(cascade=CascadeType.REMOVE, orphanRemoval=true, mappedBy="propietario")
		private List<Auto> listaAutos;

	public Propietario()
	{
		
	}
	
	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
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
	
	public List<Auto> getListaAutos() {
		return listaAutos;
	}

	public void setListaAutos(List<Auto> listaAutos) {
		this.listaAutos = listaAutos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
