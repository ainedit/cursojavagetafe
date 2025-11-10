package es.cursojava.excepciones.ejercicios.ejercicio2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Huesped extends Cliente {
	private String dni;

	public Huesped(String nombre, String dni) {
		super(nombre);
		this.dni = dni;
	}
	
}
