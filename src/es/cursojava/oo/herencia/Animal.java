package es.cursojava.oo.herencia;

public class Animal {
	private String nombre;
	private double peso;
	private long identificador;

//	public Animal() {
//		
//	}

	public Animal(String nombre, double peso, long identificador) {
		this.nombre = nombre;
		this.peso = peso;
		this.identificador = identificador;
	}

	public Animal(long identificador) {
		super();
		this.identificador = identificador;
	}

	public void comer() {
		System.out.println(
				"El animal " 
				+ this.nombre 
				+ " está comiendo");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(long identificador) {
		this.identificador = identificador;
	}
	
	

}
