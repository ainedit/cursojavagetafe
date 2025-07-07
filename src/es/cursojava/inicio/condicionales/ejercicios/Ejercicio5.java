package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tiempo de llamada");
		int minutos = scan.nextInt();

		System.out.println("Introduce día de la llamada");
		scan = new Scanner(System.in);
		String dia = scan.nextLine();
//		
		System.out.println("Introduce la hora de llamada");
		scan = new Scanner(System.in);
		int hora = scan.nextInt();
		
		//Calculo del coste de la llamada
		double costeLlamada = 1;
		if (minutos>5) {
			costeLlamada += 0.8;
		}
		if (minutos>8) {
			costeLlamada += 0.7;
		}
		if (minutos>10) {
			costeLlamada += (minutos-10)*0.5;
		}
		System.out.println("El coste de la llamada es "+costeLlamada);
		
		//Calculo de los intereses que se aplican
		double impuesto = 0;
		if(dia.equalsIgnoreCase("domingo")) {
			impuesto = 1.03;
		}else {
			if (hora>=6 && hora<12) {
				impuesto = 1.15;
			}else if (hora>=12 && hora<23){
				impuesto = 1.10;
			}else {
				impuesto = 0.9;
			}
		}
		
//		double impuesto = switch (dia) {
//			case "domingo" -> 1.03; 
//			default -> {
//				if (hora>0) {
//					return 3.0;
//				}
//				
//			};
//		}
		
		
		System.out.println("El coste de la llamada con impuestos es "
					+ costeLlamada*impuesto );
		
	}

}
