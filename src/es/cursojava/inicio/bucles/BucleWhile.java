package es.cursojava.inicio.bucles;

public class BucleWhile {

	public static void main(String[] args) {
		
		int numero = 10;
		System.out.println(numero);
		
		while (numero>0) {
			System.out.println(numero);
			if (numero%3==0) {
				numero-=2;
				continue;
			}
			
			numero--;
		}
		
		System.out.println("Termina");

	}

}
