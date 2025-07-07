package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class BuclesEjercicio3 {

	public static void main(String[] args) {
		int contador3 = 0;
		int contador5 = 0;
		
		for (int i=0 ; i<10 ; i++ ) {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Introduce un número");
			int numero = scan.nextInt();
			
			if (numero%3==0) {
				contador3 ++;
			} 
			
			if (numero%5==0) {
				contador5 ++;
			}
			
		}
		
		System.out.println("Multiplos de 3 "+ contador3);
		System.out.println("Multiplos de 5 "+ contador5);
		
		
		
		
//		int num = 0;
//		while (num<10) {
//			Scanner scan = new Scanner(System.in);
//			System.out.println("Introduce un número");
//			int numero = scan.nextInt();
//			
//			num++;
//		}
	}

}
