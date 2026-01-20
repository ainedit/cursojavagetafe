package es.cursojava.spring.beans.calculadora.beans;

import org.springframework.stereotype.Component;

@Component("multiply")
public class Multiplica implements Operacion {

	@Override
	public double calcular(double a, double b) {

		return a*b;
	}

	@Override
	public String getSimbolo() {

		return "*";
	}

}
