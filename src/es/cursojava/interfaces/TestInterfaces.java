package es.cursojava.interfaces;

import es.cursojava.oo.herencia.Animal;

public class TestInterfaces {

	public static void main(String[] args) {
		ClasePrueba p1 = new ClasePrueba();
		p1.metodo3();
		
		ClaseInterfaces i1 = new ClaseInterfaces();
		i1.metodo1();
		i1.metodo3();
		
		Interfaz2 i2 = new ClasePrueba();

		Interfaz2[] objetos = {p1,i1}; 
		prueba(p1);
		prueba(i1);
		
		Animal a = new Animal("",87,1);
		//prueba(a);
	}
	
	
	public static void prueba (Interfaz2 i2) {
		i2.metodo3();
	}

}
