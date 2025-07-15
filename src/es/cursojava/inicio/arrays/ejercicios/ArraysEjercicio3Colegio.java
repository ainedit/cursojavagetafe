package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

public class ArraysEjercicio3Colegio {

	public static void main(String[] args) {
		String colegio [][] = new String[2][];
		colegio[0] = new String[4];
		colegio[1] = new String[2];
		//colegio[1][1] = "Andrés";

		Scanner scan = new Scanner(System.in);
		int opcion = 0;
		
		do {
			System.out.println("1. Insertar Alumnos");
			System.out.println("2. Mostrar Alumnos");
			System.out.println("3. Buscar Alumno");
			System.out.println("4. Borrar Alumno");
			System.out.println("5. Salir");
			
			System.out.println("Introduce una opción");
			
			opcion = scan.nextInt();
			
			int num = 0;
			switch (opcion) {
				case 1 -> {
					boolean hayHueco = false; 
					for (int i=0 ; i<colegio.length ; i++ ) {
						for (int j=0 ; j<colegio[i].length ; j++ ) {
							if (colegio[i][j]==null) {
								System.out.println("Introduce el nombre "
										+ "del alumno para el aula "
										+ i + " y el puesto " + j);
								scan = new Scanner(System.in);
								String nombre = scan.nextLine();
								colegio[i][j] = nombre;
								
								hayHueco = true;
							}
						}
					}
					if(!hayHueco) {
						System.out.println("No hay puestos libres");
					}
					
				}
				case 2 -> {
					
					int numAula = 1;
					for ( String[]  aula :  colegio ) {
						System.out.println("Alumnos del aula "+numAula);
						for (String alumno   : aula  ) {
							if (alumno!=null) {
								System.out.println("\t"+alumno);
							}else {
								System.out.println("\tvacio");
							}
						}
						numAula++;
					}
				}
				case 3 -> {
					System.out.println("Introduce texto a buscar");
					scan = new Scanner(System.in);
					String busqueda = scan.nextLine();
					
					boolean encontrado = false;
					for (int i=0 ; i<colegio.length ; i++ ) {
						for (int j=0 ; j<colegio[i].length ; j++ ) {
							String nombreAlumno = colegio[i][j];
							
							if(nombreAlumno!=null && nombreAlumno.contains(busqueda)) {
								System.out.println("El alumno "+nombreAlumno+
										" está en el aula"+(i+1) + 
										" en el puesto "+ (j+1));
								encontrado = true;
							}
							
						}
						
						
					}
					if (!encontrado) {
						System.out.println("No se han encontrado alumnos con "+busqueda);
					}
					
				}
				case 4 -> {
					System.out.println("Introduce nombre a buscar");
					scan = new Scanner(System.in);
					String nombre = scan.nextLine();
					
					boolean encontrado = false;
					for (int i=0 ; i<colegio.length ; i++ ) {
						for (int j=0 ; j<colegio[i].length ; j++ ) {
							String nombreAlumno = colegio[i][j];
							
							if(nombre.equals(nombreAlumno)) {
								colegio[i][j] = null;
								encontrado = true;
							}
							
						}
						
						
					}
					if (!encontrado) {
						System.out.println("No se han encontrado alumnos con "+nombre);
					}
					
					
					
					
					
				}
				case 5 -> {System.out.println("Adios!!");}
				default -> {
					System.out.println("Opción incorrecta");
				}
			}
			
		}while (opcion!=0);
	
	
	}

}

