package es.cursojava.oo.herencia.ejercicios.hospital;

public class Cartero extends Persona {
	private int numCartas;
	
	public Cartero(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	public Cartero(String nombre, int edad, int numCartas) {
		super(nombre, edad);
		this.numCartas = numCartas;
	}

	@Override
	public void comer() {
		System.out.println("El cartero está comiendo en la calle");
		
	}
	
	
}
