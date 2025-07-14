package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

public class ArraysEjercicio2 {

	public static void main(String[] args) {
		
		//int [][] numeros = new int [4][4];
		//int [] fila0 = {1,2,3,4};
		int [][] numeros = { {1,2,3,4} , {5,6,7,8}, {9,10,11,12}, {13,14,15,16} }; 

		
		//Cargamos los datos en la matriz
//		for (int i = 0; i < numeros.length; i++) {
//			//Filas
//			for (int j=0; j<numeros[i].length ; j++) {
//				//Columnas
//				Scanner scan = new Scanner(System.in);
//				System.out.println("Introduce el valor para la posición"
//						+i+ ","+j);
//				int numero = scan.nextInt();
//				numeros[i][j]=numero;
//			}
//		}
		
		//Pinta los datos de la matriz
		for (int i = 0; i < numeros.length; i++) {
			for (int j=0; j<numeros[i].length ; j++) {
				if (i==j) {
					System.out.print(numeros[i][j]+"\t");
				}else {
					System.out.print("*\t");
				}
			}
			System.out.println();
		}
		
		System.out.println("==================");
		
		for (int[] fila   : numeros ) {
			for ( int numero  : fila  ) {
				System.out.print(numero+"\t");
			}
			System.out.println();
		}
		
		System.out.println("==== Diagonal =====");
		
//		int i=0;
//		do {
//			System.out.println("El valor de la posición "
//					+i+","+i+" es "+ numeros[i][i]);
//			i++;
//		}while(i<numeros.length);
		
		
		for (int k=0; k<numeros.length; k++) {
			System.out.println("El valor de la posición "
					+k+","+k+" es "+ numeros[k][k]);
		}
		
		
		System.out.println("==== Invertir Diagonal =====");
		for (int k=0; k<numeros.length/2; k++) {
			int aux = numeros[numeros.length-1-k][numeros.length-1-k];
			numeros[numeros.length-1-k][numeros.length-1-k] = numeros[k][k];
			numeros[k][k]= aux; 
		}
		for (int[] fila   : numeros ) {
			for ( int numero  : fila  ) {
				System.out.print(numero+"\t");
			}
			System.out.println();
		}
		
	}

}
