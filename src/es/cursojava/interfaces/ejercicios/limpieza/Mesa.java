package es.cursojava.interfaces.ejercicios.limpieza;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mesa extends Mueble {

	private static final Logger log = LoggerFactory.getLogger(Mesa.class);

	private String forma;

	public Mesa(String color, String forma) {
		super(color);
		this.forma = forma;
	}

	@Override
	public void limpiar() {
		log.info("Limpiando {}", this.getClass());
	}

}
