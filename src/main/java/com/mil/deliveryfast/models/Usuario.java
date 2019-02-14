package com.mil.deliveryfast.models;

public class Usuario {

	private String nombre;
	private Ciudad ciudad;

	public Usuario() {
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
}
