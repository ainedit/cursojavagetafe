package es.cursojava.inicio.bucles.ejercicios;

import java.util.Iterator;
import java.util.Scanner;

public class BuclesEjercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce número de tenistas");
		int numero = scan.nextInt();
		
		int topTen = 0;
		for (int i = 0; i < numero; i++) {
			System.out.println("Tenista "+ (i+1) +" en que puesto te encuentras?");
			int puesto = scan.nextInt();
			if(puesto<=10) {
				topTen++;
			}
		}
		
		System.out.println("El número de tenistas en el top 10 es de "+topTen);

	}

}
