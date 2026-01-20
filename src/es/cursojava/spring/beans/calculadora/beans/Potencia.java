package es.cursojava.spring.beans.calculadora.beans;

import org.springframework.stereotype.Component;

@Component("potencia")
public class Potencia implements Operacion {

	@Override
	public double calcular(double a, double b) {
		// TODO Auto-generated method stub
		return Math.pow(a, b);
	}

	@Override
	public String getSimbolo() {
		// TODO Auto-generated method stub
		return "^";
	}

}
