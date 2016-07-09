package com.example.ejer10_tablamultiplicar_listview;

public class Tabla {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return num1+"."+num2+"."+resultado;
	}

	private int num1;
	private int num2 =0;
	private int resultado;
	public Tabla(int num1, int i) {
		
		this.num1 = num1;
		num2=i;
	
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	public void multiplicar(){
		resultado = num1*num2;
		num2++;	}
	
	

}
