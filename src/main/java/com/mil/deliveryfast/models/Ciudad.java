package com.mil.deliveryfast.models;

public class Ciudad {
	
	private String nombre;
	
	public Ciudad() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
}