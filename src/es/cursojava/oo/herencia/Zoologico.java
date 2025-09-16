package es.cursojava.oo.herencia;

public class Zoologico {

	public static void main(String[] args) {
		
		Animal animal = new Vaca("Wendolin",200,555,2);
		animal.comer();

		//Esto no se puede hacer
		//Vaca animal2 = new Animal("A1",30,123123);
		
		Lobo lobo = new Lobo("Miguel",50,222,2);
		lobo.comer();
	}

}
