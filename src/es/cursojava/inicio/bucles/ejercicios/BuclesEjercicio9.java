package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class BuclesEjercicio9 {

	//static int opcion;
	
	public static void main(String[] args) {
		//variable local
		int opcion=0;
		
		do {
			String menu = "1. Pintar Cuadrado\n2. Validar email\n"
					+ "3. Añadir Alumno\n4. Salir\n\nIntroduce una opción";
			
			System.out.println(menu);
			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt(); 
			
			switch (opcion) {
				case 1 -> {
					int size = 5;
					for (int j = 0; j < size; j++) {
						for (int i = 0; i < size; i++) {
							if (j==0 || j==size-1 || i==0 || i==size-1) {
								System.out.print("* ");
							}else {
								System.out.print("  ");
							}
						}
						System.out.println();
					}
					//System.out.println("*****");
				
				}
				case 2 -> System.out.println("Opción 2");
				case 3 -> System.out.println("Opción 3");
				case 4 -> System.out.println("Adios!!!");
				default -> System.out.println("Opción incorrecta");
			
			}
			
			
		}while(opcion!=4);
	}

}
