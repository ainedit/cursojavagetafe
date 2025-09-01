package es.cursojava.metodos.ejercicios;

import java.util.Scanner;

import es.cursojava.utils.Utilidades;

public class MenuConMetodos {


	
	public static void main(String[] args) {
		//variable local
		int opcion=0;
		do {
			String menu = "1. Pintar Cuadrado\n2. Validar email\n"
					+ "3. Añadir Alumno\n4. Salir";
			Utilidades.pintaMenu(menu.split("\n"));
			opcion = Utilidades.pideDatoNumerico(""); 
			
			switch (opcion) {
				case 1 -> pintaCuadrado();
				case 2 -> validarEmail();
				case 3 -> System.out.println("Opción 3");
				case 4 -> System.out.println("Adios!!!");
				default -> System.out.println("Opción incorrecta");
			
			}
			
			
		}while(opcion!=4);
	}

	public static void pintaCuadrado() {
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
	
	public static void validarEmail() {
		String email = "  email.correo@asdas.es     ";
		String mensajeError = "";
		
		email = email.trim();
		
		if (email.isEmpty()) {
			mensajeError = "El email no puede estar en blanco";
		}else {
			if (email.contains(" ")) {
				mensajeError = "El email no puede tener espacios en blanco\n";
			}
			
			if (!email.contains("@")) {
				mensajeError += "El email no tiene arroba\n";
			}
			else if (email.indexOf("@")!=email.lastIndexOf("@")) {
				mensajeError += "El email no puede tener más de 1 arroba\n";
			}else {
				String dominio = email.substring(email.indexOf("@")+1);
				System.out.println("dominio: "+dominio);
				
				if (!dominio.contains(".")) {
					mensajeError += "El dominio del email debe contener al menos un punto \n";
				}else {//Si contiene punto
					int posicionPunto = dominio.indexOf(".");
					if (posicionPunto <2 ) {
						mensajeError += "La separación entre la @ y el primer punto debe ser superior a 2 caracteres \n";
					}
					
					int posicionUltimoPunto = dominio.lastIndexOf(".");
					int longitudDominio = dominio.length()-1;
					if (longitudDominio - posicionUltimoPunto<2 ||
							longitudDominio - posicionUltimoPunto>6) {
						mensajeError += "Después del último punto solo puede haber entre 2 y 6 caracteres \n";
					}
				}
				
				
			}
		
		}
		
		
		
		
		
		if (mensajeError.isEmpty()) {
			System.out.println("El email "+ email +" es valido");
		}else {
			System.out.println(mensajeError);
		}

	}
	
}
