package es.cursojava.spring.beans.calculadora.services;

import java.util.List;

import org.springframework.stereotype.Service;

import es.cursojava.spring.beans.calculadora.beans.Operacion;

@Service
public class CalculadoraService2 {
	private List<Operacion> operaciones;

	public CalculadoraService2(List<Operacion> operaciones) {
		this.operaciones = operaciones;
	}
	
	public double calcular(String simbolo, double a, double b) {
		for (Operacion operacion : operaciones) {
			if (operacion.getSimbolo().equals(simbolo)) {
				return operacion.calcular(a, b);
			}
		}
		throw new IllegalArgumentException("Operación no soportada: " + simbolo);
	}
	
}
