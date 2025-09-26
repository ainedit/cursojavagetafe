package es.cursojava.oo.herencia.ejercicios.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Doctor extends EmpleadoHospital {

	private static final Logger log = LoggerFactory.getLogger(Doctor.class);
	private String especialidad;

	public Doctor(String nombre, int edad, String turno, String especialidad) {
		super(nombre, edad, turno);
		this.especialidad = especialidad;
	}

	public Enfermo diagnosticarPaciente(Paciente pacienteDoctor) {
		log.debug("diagnosticarPaciente del doctor " + this.getNombre() + " se le pasa el paciente "+pacienteDoctor);
		Enfermo enfermo = null;
		
		int numeroEstaEnfermo = (int) (Math.random() * 10) + 1;
		int enfermedad = (int) (Math.random() * 100);

		boolean estaEnfermo = numeroEstaEnfermo > 0;
		
		String[] enfermedades = UtilidadesHospital.getEnfermedades();
		if (estaEnfermo) {
			enfermo = new Enfermo(pacienteDoctor.getNombre(), pacienteDoctor.getEdad(), enfermedades[enfermedad]);
		} else {
			log.info("El paciente {} es dado de alta", pacienteDoctor.getNombre());
		}

		pacienteDoctor = null;
		
		return enfermo;
	}

	@Override
	public void cobrar() {
		log.info("Doctor cobrando mucho");
		
	}
}
