package es.cursojava.colecciones.conjuntos;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import es.cursojava.oo.Persona;

public class EjemplosSet {

	public static void main(String[] args) {
		Set<Persona> conjunto = new LinkedHashSet();
		conjunto.add(null);
		System.out.println(conjunto.size());
//		lista.add("Amarillo");
//		lista.add(100.5);
		Persona p = new Persona();
		conjunto.add(p);
		for (int i = 0; i < 4; i++) {
			//boolean aniadido = conjunto.add(p);
			boolean aniadido = conjunto.add(new Persona(i+"A"));
			System.out.println(aniadido);
		}

		for (Persona persona : conjunto) {
			System.out.println(persona.getDni());
		}
		
		boolean contienep = conjunto.contains(p);
		System.out.println(contienep);
		
		Iterator<Persona> ite = conjunto.iterator();
		while(ite.hasNext()) {
			Persona persona = ite.next();
			System.out.println(persona.getDni());
//			persona = ite.next();
//			System.out.println(persona.getDni());
		}
		
	}

}
