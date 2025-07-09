package es.cursojava.inicio.strings;

//Sacar la posición donde aparece la segunda "e"
public class Ejercicio0 {

	public static void main(String[] args) {
		String cadena = "Esto es una prueba de Strings";
		
		System.out.println(cadena.indexOf("e"));
		
		System.out.println(cadena.lastIndexOf("e"));
		
		System.out.println(cadena.length());
		
		//int posicion1 = cadena.indexOf("e");
		//int posicion2 = cadena.indexOf("e",posicion1+1);
		//System.out.println(posicion2);
		
		//Usando charAt e indexOf
		for (int i=0; i<cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			//System.out.println(caracter);
			if (caracter=='e' && i!=cadena.indexOf("e")) {
				System.out.println("Posición "+i);
				break;
			}
		}
		
		//Usando substrings
		int posicionPrimeraE = cadena.indexOf("e");
		String subcadena = cadena.substring(posicionPrimeraE+1);
		System.out.println(subcadena);
		int posicionSubcadenaSegundaE = subcadena.indexOf("e")+1;
		
		System.out.println("La segunda e está en "+ (posicionPrimeraE + posicionSubcadenaSegundaE));
		
		//Forma correcta
		System.out.println("La segunda e está en "+cadena.indexOf("e",cadena.indexOf("e")+1));
	}

}
