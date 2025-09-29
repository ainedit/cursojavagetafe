package es.cursojava.interfaces.ejercicios.limpieza;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Verduras implements Desinfectable {
	private static final Logger log = LoggerFactory.getLogger(Verduras.class);
	
	private String origen;

	public Verduras(String origen) {
		this.origen = origen;
	}

	@Override
	public void limpiar() {
		log.info("Limpiando Verdura", this.getClass().getName());
	}
}
