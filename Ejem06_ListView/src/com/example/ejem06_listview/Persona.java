package com.example.ejem06_listview;

public class Persona {
	private String nombre;
	private int edad;
	private int tlf;

	public Persona(String nombre, int edad, int tlf) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.tlf = tlf;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTlf() {
		return tlf;
	}

	public void setTlf(int tlf) {
		this.tlf = tlf;
	}
	
	public String toString(){
		return this.nombre;
	}

}
