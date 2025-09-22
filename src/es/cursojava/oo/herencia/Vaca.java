package es.cursojava.oo.herencia;

public class Vaca extends Animal{

	private int numCuernos;
	
	public Vaca(String nombre, double peso, 
			long identificador, int numCuernos) {
		super(nombre,peso,identificador);
	}

	public int getNumCuernos() {
		return numCuernos;
	}

	public void setNumCuernos(int numCuernos) {
		this.numCuernos = numCuernos;
	}
	
	public void mugir() {
		System.out.println("La vaca "+ getNombre() + " está mugiendo");
	}
	
//	public void comer() {
//		System.out.println(
//				"La vaca "+ getNombre() 
//				+ " está pastando");
//	}
	@Override
	public void comer() {
		System.out.println(
		"La vaca "+ getNombre() 
		+ " está pastando");
	}

	@Override
	public String toString() {
		return "Vaca [numCuernos=" + numCuernos + ", getNombre()=" + getNombre() + ", getPeso()=" + getPeso()
				+ ", getIdentificador()=" + getIdentificador() + "]";
	}

	
	
}
