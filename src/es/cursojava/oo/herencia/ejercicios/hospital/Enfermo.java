package es.cursojava.oo.herencia.ejercicios.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Enfermo extends Persona {

	private static final Logger log = LoggerFactory.getLogger(Enfermo.class);

	private String enfermedad;

	
	public Enfermo(String nombre, int edad, String enfermedad) {
		super(nombre, edad);
		this.enfermedad = enfermedad;
	}


	@Override
	public void comer() {
		log.info("Enfermo {} comiendo en la habitacion", super.getNombre());
	}


	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}


	@Override
	public String toString() {
		return "Enfermo [enfermedad=" + enfermedad + ", nombre=" + getNombre() + ", edad=" + getEdad() + "]";
	}
	
	
	
}
