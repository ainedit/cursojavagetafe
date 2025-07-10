package es.cursojava.inicio.strings.ejercicios;

public class StringsEjercicio4 {

	public static void main(String[] args) {
		String frase = "Enasd un lugar de la Mancha de "
				+ "cuyo nombre no puedo acordarme";
		frase+= " ";
		String palabraMasLarga = "";
		while (frase.length()>palabraMasLarga.length()){
		//while (frase.strip().contains(" ")) {
			int  posicionBlanco = frase.indexOf(" ");
			
			String palabra = frase.substring(0,posicionBlanco);
			if (palabra.length()>palabraMasLarga.length()) {
				palabraMasLarga = palabra;
			}
			frase = frase.substring(posicionBlanco+1);
			//System.out.println("'"+frase+"'");
			
		}
		System.out.println("La palabra más larga es: "+palabraMasLarga);

		
		
		
	}

}
