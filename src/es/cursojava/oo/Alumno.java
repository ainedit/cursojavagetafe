package es.cursojava.oo;

import java.util.Arrays;

import es.cursojava.excepciones.ejercicios.ejercicio1.NotaInvalidaException;

public class Alumno {
	//Variables de instancia
	static int numero;
	private String nombre;
	private String dni;
	private double notaMedia=10;
	private String[] asignaturas;
	private int edad;
	
	//Constructores
	public Alumno() {
		
	}
	
	public Alumno(String nombre) {
		this.nombre = nombre;
	}
	
	public Alumno(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public Alumno(String nombre, String dni, double notaMedia, 
			String[] asignaturas, int edad) throws NotaInvalidaException{
		super();
		
		if (edad<=0) {
			throw new IllegalArgumentException("Edad no valida");
		}else if (notaMedia<0 || notaMedia>10 ) {
			throw new NotaInvalidaException("Nota fuera de rango correcto (0-10)");
		}
		
		
		this.nombre = nombre;
		this.dni = dni;
		this.notaMedia = notaMedia;
		this.asignaturas = asignaturas;
		this.edad = edad;
	}

	public Alumno(String nombre, String dni, double notaMedia, String[] asignaturas) {
		//this(nombre,dni,notaMedia,asignaturas, 0);
		this.nombre = nombre;
		this.dni = dni;
		this.notaMedia = notaMedia;
		this.asignaturas = asignaturas;
	}

	public Alumno(String nombre, String dni, double notaMedia) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.notaMedia = notaMedia;
	}
	
	//Métodos GET y SET
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
	
	
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void metodo1() {
		
	}
	
	
	//Métodos de instancia
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

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", dni=" + dni + ", notaMedia=" + notaMedia + ", asignaturas="
				+ Arrays.toString(asignaturas) + ", edad=" + edad + "]";
	}


	
	
	
}
