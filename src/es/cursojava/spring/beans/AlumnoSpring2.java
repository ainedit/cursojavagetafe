package es.cursojava.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AlumnoSpring2 {

	@Value("Ana")
	private String nombre;

	@Value("García")
	private String apellidos;

	@Value("8.5")
	private double notaMedia;

	
	@Override
	public String toString() {
		return "AlumnoSpring2 [nombre=" + nombre + ", apellidos=" + apellidos + ", notaMedia=" + notaMedia + "]";
	}
	
	
}
