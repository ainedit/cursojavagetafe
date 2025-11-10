package es.cursojava.excepciones.ejercicios.ejercicio2;

public class Comensal extends ClienteCafetero {
	private boolean tieneReserva;

	public Comensal(String nombre, boolean tieneReserva) {
		super(nombre);
		this.tieneReserva = tieneReserva;
	}

	public boolean isTieneReserva() {
		return tieneReserva;
	}

	public void setTieneReserva(boolean tieneReserva) {
		this.tieneReserva = tieneReserva;
	}
	
}
