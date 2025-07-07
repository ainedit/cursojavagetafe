package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero1 = scan.nextInt();
		
		System.out.println("Introduce otro número");
		int numero2 = scan.nextInt();
		
		System.out.println("Introduce la operación");
		scan = new Scanner(System.in);
		String operacion = scan.nextLine();
		
		int resultado = 0;
		if(operacion.equals("+") || operacion.equalsIgnoreCase("suma")) {
			resultado = numero1 + numero2;
		}else if(operacion.equals("-") || operacion.equalsIgnoreCase("resta")) {
			resultado = numero1 - numero2;
		}else if(operacion.equals("x") || operacion.equalsIgnoreCase("multiplica")) {
			resultado = numero1 * numero2;
		}else if(operacion.equals("/") || operacion.equalsIgnoreCase("divide")) {
			resultado = numero1 / numero2;
		}else {
			System.out.println("Operación no permitida");
		}
		System.out.println("El resultado es "+resultado);
		
		
		
		
		
		
		
		String operacion2 = "suma";
		String operacion21 = "suma";
		String operacion3 = new String("suma");
		String operacion4 = "suma";
		operacion4 = operacion4.toUpperCase();
		
		if (operacion3.equals(operacion4)) {
			System.out.println("Suma0");
		}
		
		if (operacion == operacion2) {
			System.out.println("Suma1");
		}
		
		if(operacion2 == operacion21) {
			System.out.println("Suma2");
		}
		
		if(operacion3 == operacion2) {
			System.out.println("Suma3");
		}
		
		if(operacion3.equals(operacion2)) {
			System.out.println("Suma4");
		}
	}
	
}
