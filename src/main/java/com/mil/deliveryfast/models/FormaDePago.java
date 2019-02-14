package com.mil.deliveryfast.models;

public class FormaDePago {

	private String nombre;
	
	public FormaDePago() {
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
