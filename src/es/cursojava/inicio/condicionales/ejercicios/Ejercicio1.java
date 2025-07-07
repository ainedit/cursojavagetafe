package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero = scan.nextInt();
		
		if (numero%2==0) {
			System.out.println("El número "+numero +" es par");
		}else {
			System.out.println("El número "+numero +" es impar");
		}
		
		//Otra forma
		boolean resultadoCero = numero%2==0;
		if(!resultadoCero) {
			System.out.println("El número "+numero +" es impar");
		}else {
			System.out.println("El número "+numero +" es par");
		}
		
		//Operador ternario
		//condicion?ejecucion_true:ejecucion_false
		System.out.println(numero%2==0?"Par":"Impar");
		
		
	}

}
