package es.cursojava.inicio.strings.ejercicios;

public class StringsEjercicio3 {

	public static void main(String[] args) {
		String frase = "En un lugar de la Mancha de "
				+ "cuyo nombre no puedo acordarme";
		
		String fraseMinusculas = frase.toLowerCase();
		
		int contadorVocales = 0;
		String vocalesFrase = "";
		for (int i=0; i<fraseMinusculas.length(); i++) {
			char caracter = fraseMinusculas.charAt(i);
			
			if (caracter == 'a' || caracter == 'e' || caracter == 'i'
					|| caracter == 'o' || caracter == 'u') {
				contadorVocales++;
				vocalesFrase += caracter+"-"; 
			}
			
			
		}
		
		System.out.println("Hay "+contadorVocales+" vocales en la frase "+frase);
		System.out.println(vocalesFrase);
	}

}
