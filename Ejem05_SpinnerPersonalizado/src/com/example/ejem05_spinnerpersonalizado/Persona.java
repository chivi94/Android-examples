package com.example.ejem05_spinnerpersonalizado;

public class Persona {

	private String nombre;
	private int edad;
	private String tlf;
	
	public Persona(String nombre,int edad,String tlf){
		super();
		this.nombre=nombre;
		this.edad=edad;
		this.tlf=tlf;				
	}
	public String toString(){
		return this.nombre+" "+this.edad+" "+this.tlf;
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
	public String getTlf() {
		return tlf;
	}
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
	
}
