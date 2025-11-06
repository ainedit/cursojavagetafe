package es.cursojava.excepciones.ejercicios;

import es.cursojava.utils.Utilidades;

public class EjercicioExcepciones {

	public static void main(String[] args) {
		
		int numeros[] = crearArray();
		rellenarArray(numeros);
		muestraPosicion(numeros);
	}

	private static void multiplica (int numero) {
		numero *= 10;
	}
	
	private static int [] crearArray () {
		
		int arraySize = Utilidades.pideDatoNumerico("Introduce el tamaño del array");
		int numeros[] = new int[arraySize];
		
		return numeros;
	}
	
	private static void rellenarArray (int numeros []) {
		try {
			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = Utilidades.pideDatoNumerico("Introduce número para posición "+i);
			}
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Error rellenarArray" +aiobe.getMessage());
		}
	}
	
	private static void muestraPosicion(int numeros []) {
		int pos = 0;
		try {
			pos = Utilidades.pideDatoNumerico("Introduce posición a mostrar");
			System.out.println(numeros[pos]);
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Error al obtener la posición " +pos + " " +aiobe.getMessage());
		}
	}
	
	
}
