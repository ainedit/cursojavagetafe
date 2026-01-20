package es.cursojava.spring.beans.calculadora.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import es.cursojava.spring.beans.calculadora.beans.Operacion;

@Service
public class CalculadoraService2 {
	//private List<Operacion> operaciones;
	private final Map<String, Operacion> operaciones = new HashMap<>();
	
	public CalculadoraService2(List<Operacion> operaciones) {
		for (Operacion operacion : operaciones) {
			this.operaciones.put(operacion.getSimbolo(), operacion);
		}
		
	}
	
//	public double calcular(String simbolo, double a, double b) {
//		for (Operacion operacion : operaciones) {
//			if (operacion.getSimbolo().equals(simbolo)) {
//				return operacion.calcular(a, b);
//			}
//		}
//		throw new IllegalArgumentException("Operación no soportada: " + simbolo);
//	}
	
	public double calcular(String simbolo, double a, double b) {
		Operacion operacion = operaciones.get(simbolo);
		if (operacion != null) {
			return operacion.calcular(a, b);
		}
		throw new IllegalArgumentException("Operación no soportada: " + simbolo);
	}
	
}
