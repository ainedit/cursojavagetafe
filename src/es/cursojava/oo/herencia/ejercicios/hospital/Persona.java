package es.cursojava.oo.herencia.ejercicios.hospital;

public abstract class Persona {

	private String nombre;
	private int edad;

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	public abstract void comer();
	
	public void beber() {
		System.out.println("La persona "+nombre+" está bebiendo agua");
	}
	
}
