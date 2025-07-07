package es.cursojava.inicio;

import java.util.Scanner;

public class TiposDeDatos {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//*********************************************
		//Tipos primitivos
		//*********************************************
		
		//Enteros
		//byte	8	-128		127
		//short	16	-32.768		32.767
		//int	32	-2³¹ (-2.147.483.648)	2³¹-1 (2.147.483.647)
		//long	64	-2⁶³	2⁶³-1
		byte edad = 12;
		short numero2 = 128;
		int numero = 2300;
		long numero3 = 1_890_123_123;
		
		//Decimales
		double decimal1 = 9.7;
		float decimal2 = 100.9f;
		
		
		//Caracteres
		char caracter = ' ';
		
		//Booleanos
		boolean esMayorEdad = 8!=3;
		
		System.out.println("10" + edad + numero2);
		
		//*********************************************
		//Tipos objeto
		//*********************************************
		String nombre = "Jose Luis";
		nombre.toUpperCase();
		
		System.out.println(Math.random());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tus apellidos");
		String apellidos = scan.nextLine();
		
		System.out.println("Introduce tu altura");
		double altura = scan.nextDouble();

		System.out.println("Introduce tu ciudad");
		scan = new Scanner(System.in);
		String ciudad = scan.nextLine();
		
		System.out.println(nombre + " "+apellidos + " " + altura);
	}
	
}

