package es.cursojava.oo.herencia.ejercicios.hospital;

public class Habitacion {
	private int habitacion;
	private Enfermo enfermo;

	public Habitacion(int numHabitacion) {
		this.habitacion = numHabitacion;
	}

	public void setEnfermo(Enfermo enfermo) {
		this.enfermo = enfermo;
	}

	public Enfermo getEnfermo() {
		return enfermo;
	}

	public int getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(int habitacion) {
		this.habitacion = habitacion;
	}

	
}
