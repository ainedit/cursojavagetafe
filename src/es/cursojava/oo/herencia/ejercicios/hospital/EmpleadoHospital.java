package es.cursojava.oo.herencia.ejercicios.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class EmpleadoHospital extends Persona {

	private static final Logger log = LoggerFactory.getLogger(Paciente.class);

	private String turno;
	
	public EmpleadoHospital(String nombre, int edad, String turno) {
		super(nombre, edad);
		this.turno = turno;
	}

	public abstract void cobrar();
	
	public void fichar() {
		log.info("El empleado {} esta fichando", super.getNombre());
	}

	@Override
	public void comer() {
		log.info("El empleado {} esta comiendo en el comedor", super.getNombre());
	}
}
