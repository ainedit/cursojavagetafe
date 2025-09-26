package es.cursojava.oo.herencia.ejercicios.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Enfermero extends EmpleadoHospital {
	private static final Logger log = LoggerFactory.getLogger(Enfermero.class);
	private int planta;

	
	public Enfermero(String nombre, int edad, String turno, int planta) {
		super(nombre, edad, turno);
		this.planta = planta;
	}

	public void atenderPaciente() {

	}
	
	@Override
	public void cobrar() {
		log.info("Enfermero cobrando poco");
		
	}
}
