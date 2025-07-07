package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class BuclesEjercicio6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero = scan.nextInt();
		System.out.println(numero);
		do {
			if (numero%2==0) {
				numero = numero/2;
			}else {
				numero = numero*3+1;
			}
			System.out.println(numero);
		}while(numero!=1);
	}
}
