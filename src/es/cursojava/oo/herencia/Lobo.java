package es.cursojava.oo.herencia;

public final class Lobo extends Animal{
	private int numColmillos;

	public Lobo(String nombre, double peso, long identificador) {
		super(nombre, peso, identificador);
		// TODO Auto-generated constructor stub
	}

	public Lobo(String nombre, double peso, long identificador, int numColmillos) {
		super(nombre, peso, identificador);
		this.numColmillos = numColmillos;
	}

	public int getNumColmillos() {
		return numColmillos;
	}

	public void setNumColmillos(int numColmillos) {
		this.numColmillos = numColmillos;
	}
	
	@Override
	public void comer() {
		System.out.println("El lobo está cazando");
		super.comer();
		
	}
	
}
