package es.cursojava.interfaces.ejercicios.limpieza;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lechuga extends Verduras {
	
	private static final Logger log = LoggerFactory.getLogger(Lechuga.class);

	private String variedad;

	public Lechuga(String origen, String variedad) {
		super(origen);
		this.variedad = variedad;
	}

	@Override
	public void desinfectar() {
		log.info("Desinfectando {}", this.getClass().getSimpleName());
	}

	

}
