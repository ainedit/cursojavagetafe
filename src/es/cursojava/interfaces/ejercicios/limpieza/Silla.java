package es.cursojava.interfaces.ejercicios.limpieza;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Silla extends Mueble {

	private static final Logger log = LoggerFactory.getLogger(Silla.class);

	private int numRuedas;

	public Silla(String color, int numRuedas) {
		super(color);
		this.numRuedas = numRuedas;
	}

	@Override
	public void limpiar() {
		log.info("Limpiando {}", this.getClass());
	}
}
