package es.cursojava.spring.beans;

public class AlumnoSpring {

	private String nombre;
	private String apellidos;
	private double notaMedia;

	public AlumnoSpring(String nombre, String apellidos, double notaMedia) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "AlumnoSpring [nombre=" + nombre + ", apellidos=" + apellidos + ", notaMedia=" + notaMedia + "]";
	}
	
	
}