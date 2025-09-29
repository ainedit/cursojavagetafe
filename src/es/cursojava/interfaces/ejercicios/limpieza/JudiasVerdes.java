package es.cursojava.interfaces.ejercicios.limpieza;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JudiasVerdes extends Verduras {

	private static final Logger log = LoggerFactory.getLogger(JudiasVerdes.class);

	private boolean tieneVaina;

	public JudiasVerdes(String origen, boolean tieneVaina) {
		super(origen);
		this.tieneVaina = tieneVaina;
	}

	@Override
	public void desinfectar() {
		log.info("Desinfectando {}", this.getClass().getSimpleName());
	}

	@Override
	public void limpiar() {
		super.limpiar();
		log.info("Y pelándolas");
	}

}
