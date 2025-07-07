package es.cursojava.inicio.bucles;

import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) {
		
		String respuesta="";
		int contador = 0;
		
		do {
			
			System.out.println("Hola");
			Scanner scan = new Scanner(System.in);
			System.out.println("Quieres continuar??");
			respuesta = scan.nextLine();
		
			if (contador==2) {
				break;
			}
			
			contador++;

		}while ( respuesta.equals("si") );
		
		System.out.println("Termina");
	}

}
