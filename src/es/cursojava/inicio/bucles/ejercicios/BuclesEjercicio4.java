package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class BuclesEjercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero = scan.nextInt();
		
		for (int i=1 ; i<=numero ; i++ ) {
			System.out.println("Tabla del "+i);
			
			for (int j=1 ; j<=10 ; j++ ) {
				System.out.print(i + "X" + j + " = "+ i*j + "\n" );
			}
			
			System.out.println();
		}

	}

}
