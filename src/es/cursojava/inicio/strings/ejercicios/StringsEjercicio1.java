package es.cursojava.inicio.strings.ejercicios;

public class StringsEjercicio1 {

	public static void main(String[] args) {
		String texto = "Monitor";
		
		//rotinoM
		String palabraInvertida = "";
		
		for ( int i=texto.length()-1  ; i >= 0 ;  i-- ) {
			//System.out.print(texto.charAt(i));
			palabraInvertida += texto.charAt(i);
		}
		System.out.println(palabraInvertida);
		
		
		
		//Se generan 7 objetos
		String cadena = "Hola"+" que"+ " tal "+ " estas?";
		System.out.println(cadena);
		
		//Se generan 1 solo objeto
		StringBuilder sb = new StringBuilder("");
		sb.append("Hola");
		sb.append(" que");
		sb.append(" tal");
		sb.append(" estas?");
		System.out.println(sb);
		
		//Doy la vuelta con el reverse
		StringBuilder sb1 = new StringBuilder(texto);
		System.out.println("Reverse: "+sb1.reverse());
		
		
		
		
	}

}
