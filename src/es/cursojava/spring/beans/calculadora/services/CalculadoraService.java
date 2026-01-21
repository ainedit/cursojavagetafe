package es.cursojava.spring.beans.calculadora.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cursojava.spring.beans.Usuario;
import es.cursojava.spring.beans.calculadora.beans.Divide;
import es.cursojava.spring.beans.calculadora.beans.Multiplica;
import es.cursojava.spring.beans.calculadora.beans.Resta;
import es.cursojava.spring.beans.calculadora.beans.Suma;



@Service
public class CalculadoraService {
	@Autowired
	private Suma suma;
	@Autowired
	private Resta resta;
	@Autowired
	private Multiplica multiply;
	@Autowired
	private Divide divide;
	@Autowired
	private Usuario usuario;
	
//	public CalculadoraService(@Qualifier("suma") Suma suma, 
//							@Qualifier("resta") Resta resta, 
//							@Qualifier("multiply") Multiplica multiply, 
//							@Qualifier("divide")Divide divide) {
//		this.suma = suma;
//		this.resta = resta;
//		this.multiply = multiply;
//		this.divide = divide;
//	}
	
	public double calcular(double a, double b, String operacion) {
		double resultado = 0;

		switch (operacion) {
			case "suma":
				resultado = suma.calcular(a, b);
				break;
			case "resta":
				resultado = resta.calcular(a, b);
				break;
			case "multiply":
				resultado = multiply.calcular(a, b);
				break;
			case "divide":
				resultado = divide.calcular(a, b);
				break;
			default:
				throw new IllegalArgumentException("Operación no soportada: " + operacion);
			}

		return resultado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
