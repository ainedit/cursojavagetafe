package es.cursojava.inicio.ejercicios;

import java.util.Scanner;

public class PideDatos {

	public static void main(String[] args) {
		//Solicitar dirección: - nombre de calle,- número - población
		System.out.println("Introduce nombre de la calle");
		Scanner scan = new Scanner(System.in);
		String nombreCalle = scan.nextLine();
		
		
		System.out.println("Introduce número de la calle");
		scan = new Scanner(System.in);
		int numeroCalle = scan.nextInt();
		
		System.out.println("Introduce poblacion");
		scan = new Scanner(System.in);
		String poblacion = scan.nextLine();
		
		//Mostrar los datos recogidos por consola
		System.out.println(nombreCalle + " " + numeroCalle + " " +poblacion);

		
		//Mostrar: "La calle es grande ": <true o false>, si el número de la calle es mayor de 100 "true" en caso contrario "false"
		boolean esGrande = numeroCalle>100;
		System.out.println("La calle es grande: " + esGrande);
		
//		System.out.println(numeroCalle%2==0);
//		System.out.println("====================");
//		numeroCalle = 7;
//		System.out.println(numeroCalle );//7
//		numeroCalle  = numeroCalle + 1;
//		System.out.println(numeroCalle );//8
//		
//		numeroCalle *= 3;
//		System.out.println(numeroCalle);//24
//		//9
//		System.out.println(++numeroCalle);//
//		System.out.println(numeroCalle);
		//numeroCalle++;
		//System.out.println(numeroCalle);//11
		
		
		//Generar número aleatorio e indicar el numero que se genera y si es > de 0,5 (poniendo true o false)
		double numeroAleatorio = Math.random();
		System.out.println(numeroAleatorio);
		System.out.println("Es mayor de 0,5 " + (numeroAleatorio>0.5) );
		
	}

}






