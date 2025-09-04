package es.cursojava.oo;

import java.util.Arrays;

public class Alumno {
	static int numero;
	private String nombre;
	private String dni;
	private double notaMedia=10;
	private String[] asignaturas;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	public String[] getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	public void metodo1() {
		
	}
	
	public void estudiar () {

		System.out.println("El estudiante "+ nombre +
				" tiene las asignaturas "+Arrays.toString(asignaturas));
		
		if (this.notaMedia<5) {
			System.out.println("Ha estudiado poco");
		}else if (this.notaMedia>9) {
			System.out.println("Es un genio");
		}else {
			System.out.println("Ha estudiado mucho");
		}
	}
	
}
