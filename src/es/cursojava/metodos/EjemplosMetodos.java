package es.cursojava.metodos;

import es.cursojava.inicio.arrays.Persona;
import es.cursojava.utils.Utilidades;

public class EjemplosMetodos {
	
	public static void main(String[] args) {
		int edad = Utilidades.calcularEdad(2001);
		System.out.println(edad);
		
		int num = Integer.parseInt("7");
		double decimal = Double.parseDouble("7.5");
		
		Metodos.saludar("Jose Luis");
		
		System.out.println("Empieza");
		metodo1();
		
		String name = "Juan";
		Metodos.saludar(name);
		System.out.println(name);
		metodo2(name);
		System.out.println(name);
		
		
		
		Persona p = new Persona("Juan");
		System.out.println(p.nombre);//Juan
		metodo2(p);
		System.out.println(p.nombre);//Juan
		
		System.out.println("Termina");

		metodo4();
		
	}

	public static void metodo1 () {
		System.out.println("Llamado método1");
		metodo2("");
	}
	
	private static void metodo2 (Persona persona) {
		System.out.println(persona.nombre);//Juan
		persona.nombre = "María";
		System.out.println(persona.nombre);//Maria
		
	}
	
	private static void metodo2 (String nombre) {
		System.out.println(nombre);//Juan
		nombre = "María";
		System.out.println(nombre);//Maria
		
		//return nombre;
	}
	
	private static void metodo2 (String nombre,int numero) {
		System.out.println(nombre);//Juan
		nombre = "María";
		System.out.println(nombre);//Maria
		
		//return nombre;
	}
	
	
	public static void metodo3 (int numero) {
		System.out.println(numero);
		numero = 7;
		System.out.println(numero);
		
	}

	private static double metodo4 () {
		
		return Math.random();
	}
	
	
}






