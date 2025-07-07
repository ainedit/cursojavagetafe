package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		System.out.println("1. Pintar Cuadrado");
		System.out.println("2. Validar email");
		System.out.println("3. Añadir Alumno");
		System.out.println("4. Salir");

		System.out.println("Elige una opción");

		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();
		
		//switch tradicional
		switch (opcion) {
			case 1: System.out.println("Pintar cuadrado");break;
			case 2: 
				System.out.println("Validar email");
				System.out.println("Validar email");
				System.out.println("Validar email");
				System.out.println("Validar email");
				System.out.println("Validar email");
				System.out.println("Validar email");
				break;
			case 3: System.out.println("Añadir alumno");break;
			case 4: System.out.println("Adios");break;
			default: System.out.println("Opción incorrecta");break;
		}
		
		//switch nuevo
		switch (opcion) {
			case 1 -> System.out.println("Pintar Cuadrado");
			case 2 -> System.out.println("Validar email");
			case 3 -> System.out.println("Añadir alumno");
			case 4 -> System.out.println("Adios");
			default ->  System.out.println("Opción incorrecta");
		}
		
	}

}
