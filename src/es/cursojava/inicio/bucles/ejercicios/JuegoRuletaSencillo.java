package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class JuegoRuletaSencillo {

	public static void main(String[] args) {
		double saldo = 500;
		boolean seguirJugando = true;
		do {
			//Pedimos el número por el que se va a apostar
			boolean numeroCorrecto=true;
			int numeroApostado=0;
			do {
				System.out.println("¿Por qué numero quieres apostar? (0-36)");
				Scanner scan = new Scanner(System.in);
				numeroApostado = scan.nextInt();
				
				numeroCorrecto = numeroApostado<=36 && numeroApostado>0;
				
				if (!numeroCorrecto) {
					System.out.println("Número incorrecto");
				}
				
			}while(!numeroCorrecto);
			
			//Solicitamos importe para apostar
			boolean saldoApuestaCorrecto=true;
			double importeApostado;
			do {
				System.out.println("Tienes "+saldo);
				System.out.println("¿Cuánto dinero quieres apostar?");
				Scanner scan = new Scanner(System.in);
				importeApostado = scan.nextDouble();
				
				saldoApuestaCorrecto = importeApostado<=saldo;
				if (!saldoApuestaCorrecto) {
					System.out.println("No tienes tanto saldo");
					System.out.println("Tienes "+ saldo);
	
				}
				
			}while(!saldoApuestaCorrecto);
			
			//Quitamos el saldo apostado
			saldo -= importeApostado;
			
			//Se genera un número entre 0 y 36 
			int numeroRuleta = (int)(Math.random()*37);
			System.out.println("El número obtenido es el "+numeroRuleta);
			
			if(numeroApostado==numeroRuleta) {
				System.out.println("Has ganado");
				//saldo = saldo + (importeApostado*36);
				saldo += importeApostado*36;
			}else {
				System.out.println("Has perdido");
			}
			System.out.println("Tu saldo es de "+saldo);
			
			if (saldo>0) {
				System.out.println("Quieres seguir jugando");
				Scanner scan = new Scanner(System.in);
				String respuesta = scan.nextLine();
				
				if(respuesta.equalsIgnoreCase("no")) {
					seguirJugando = false;
				}
			}
			
		}while(saldo>0 && seguirJugando);
		System.out.println("Te vas con "+saldo);
		System.out.println("Adios!!");
	}

}
