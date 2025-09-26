package es.cursojava.interfaces;

public class ClaseInterfaces implements Interfaz1{

	@Override
	public int metodo3() {
		System.out.println("Metodo3");
		return 0;
	}

	@Override
	public String metodo4(int numero) {
		System.out.println("Metodo4 " + numero);
		return null;
	}

	@Override
	public void metodo1() {
		System.out.println("Metodo1");
		// TODO Auto-generated method stub
	}

	@Override
	public void metodo2(String nombre) {
		System.out.println("Metodo2");
		// TODO Auto-generated method stub
	}

}
