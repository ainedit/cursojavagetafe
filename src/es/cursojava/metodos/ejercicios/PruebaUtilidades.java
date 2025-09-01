package es.cursojava.metodos.ejercicios;

import static es.cursojava.utils.Utilidades.pintaMenu;

import es.cursojava.utils.Utilidades;

public class PruebaUtilidades {

	public static void main(String[] args) {

		pintaMenu(args,"Elige una acción");
		
		Utilidades.pideDatoNumerico("asdas");
		
		int numero = Utilidades.pideDatoNumerico("Introduce un numero");
		
		
	}

}
