package es.cursojava.oo.herencia.ejercicios.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Paciente extends Persona {

	private static final Logger log = LoggerFactory.getLogger(Paciente.class);
	private String[] sintomas;

	public Paciente(String nombre, int edad, String[] sintomas) {
		super(nombre, edad);
		this.sintomas = sintomas;
	}

	@Override
	public void comer() {
		log.info("Paciente {} comiendo en la cafetería", super.getNombre());
	}

	public String[] getSintomas() {
		return sintomas;
	}

	public void setSintomas(String[] sintomas) {
		this.sintomas = sintomas;
	}
	
	
}
