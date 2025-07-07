package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

/*
5. Solicitar por consola el numero de alumnos de un aula. 
Pedir para cada alumno su nota
Indicar la nota media de todos los alumnos del aula. 
 
 */
public class BuclesEjercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número de alumnos");
		int numeroAlumnos = scan.nextInt();
		
		int sumatorioNotas = 0;
		int alumnosAprobados = 0;
		int sumatorioNotasAprobados = 0;
		for (int i=0 ; i<numeroAlumnos ; i++ ) {
			System.out.println("Introduce la nota del alumno "+ (i+1));
			int nota = scan.nextInt();
			
			if (nota>=5) {
				alumnosAprobados++;
				sumatorioNotasAprobados += nota;
			}
			//sumatorioNotas = sumatorioNotas + nota;
			sumatorioNotas+=nota;
		}

		System.out.println("La nota media de todos los "
				+ "alumnos es "+ (sumatorioNotas/numeroAlumnos));
		
		System.out.println("La nota media de todos los "
				+ "alumnos aprobados es "+ (sumatorioNotasAprobados/alumnosAprobados));
		
	}

}
