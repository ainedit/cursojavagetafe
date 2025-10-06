package es.cursojava.colecciones.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import es.cursojava.oo.Persona;

public class EjemplosListas {

	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList();
//		lista.add("Amarillo");
//		lista.add(100.5);
		Persona p = new Persona();
		for (int i = 0; i < 10; i++) {
			boolean aniadido = lista.add(new Persona(i+"A"));
			//System.out.println(aniadido);
		}
		
		Persona p1 = new Persona("11A");
		//lista.add(p1);//Lo añade el último
		//lista.addLast(p1);
		//lista.addFirst(p1);//Lo añade el primero
		lista.add(3,p1);
		lista.addLast(p1);
		
//		System.out.println(lista.contains(p1));
//		System.out.println(lista.contains(new Persona("1A")));
//		
//		System.out.println(lista.get(3).getDni());
		
		String[] nombres = {"Nombre1","Nombre2"};
		List<String> listaNombres = Arrays.asList(nombres);
		listaNombres.toArray(nombres);
		//Esto solo cuando no se pone genérico
//		for (Object object : lista) {
//			if(object instanceof Persona) {
//				Persona p = (Persona)object;
//				p.getNombre();
//			}
//		}

		lista.remove(1);
		lista.remove(p1);
		for (Persona persona : lista) {
			System.out.println(persona.getDni());
		}
		
		
		
	}

}
