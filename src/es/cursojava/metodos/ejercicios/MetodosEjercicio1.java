package es.cursojava.metodos.ejercicios;

public class MetodosEjercicio1 {

	public static void main(String[] args) {
		
		pintaTablasMultiplicar(7,9);
	}
	
	
	/**
	 * Método que muestra la tabla de multiplicar del número que recibe
	 * @author Jose Luis 
	 * @version 1.0
	 * @param numero
	 */
	private static void pintaTablaMultiplicar (int numero) {
		System.out.println("Tabla del " + numero);
		for (int i= 1; i<=10 ; i++) {
			System.out.println(i + " x "+ numero + " = "+ (i*numero));
		}
	}
	
	
	private static void pintaTablasMultiplicar (int numero1, int numero2) {
		
		for(int i=numero1;i<=numero2;i++) {
			pintaTablaMultiplicar(i);
		}
		
		
	}

}
