package es.cursojava.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidades {

	public static int calcularEdad (int anioNacimiento) {
		int edad = 0;
		
		edad = 2025 - anioNacimiento;
		
		return edad;
	}
	
	public static void pintaMenu (String[] opciones) {
		
//		for (String opcion : opciones) {
//			System.out.println(opcion);
//		}
//		System.out.println("Introduce una opción");
		pintaMenu(opciones,"Introduce una opción");
	}
	
	public static void pintaMenu (String[] opciones, String texto) {
//		pintaMenu(opciones);
		for (String opcion : opciones) {
			System.out.println(opcion);
		}
		System.out.println(texto);
	}
	
	public static int pideDatoNumerico (String texto) {
		int numero=0;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		
		try {
			return scan.nextInt();
		} catch (InputMismatchException | NumberFormatException e) {
			System.out.println("No has introducido un valor correcto");
			return pideDatoNumerico(texto);
		}
		
	}
	
	public static String pideDatoCadena (String texto) {
		String dato="";
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		dato = scan.nextLine();
		
		return dato;
	}
}
