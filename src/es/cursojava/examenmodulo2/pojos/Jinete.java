package es.cursojava.examenmodulo2.pojos;

import java.util.Random;

import es.cursojava.examenmodulo2.interfaces.Participable;

public class Jinete extends Persona implements Participable{

	private int aniosExperiencia;
	private String identificador;
	
	public Jinete(String nombre, int edad) {
		super(nombre, edad);
	}

	public Jinete(String nombre, int edad, int aniosExperiencia) {
		super(nombre, edad);
		this.aniosExperiencia = aniosExperiencia;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override
	public String toString() {
		return "Jinete [aniosExperiencia=" + aniosExperiencia + "]";
	}

	@Override
	public String getIdentificador() {
		Random random = new Random();
		this.identificador = "Jinete "+random.nextInt(1, 1000);
		return identificador;
	}
	
	

}
