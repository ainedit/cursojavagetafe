package es.cursojava.utils;

public class Ahorcado {

	private static String[] sujetos = { "El gato", "La niña", "Mi amigo", "Un hombre", "La policía", "El perro",
			"La profesora", "Un payaso", "El médico", "La madre", "El robot", "Mi vecino" };

	private static String[] verbos = { "come", "pinta", "busca", "rompe", "salta", "canta", "lava", "lee", "mueve",
			"atrapa", "conduce", "enciende" };

	private static String[] complementos = { "una manzana", "la casa", "el coche", "una canción", "el jardín",
			"la calle", "el balón", "un sombrero", "la ventana", "la lámpara", "el periódico", "el fuego" };

	// sujeto + verbo + complemento
	// get 12 phrases

	//FIXME: El método se debe hacer privado
	private static String generateRandomPhrase() {
		return sujetos[(int) (Math.random() * 12)] + " " + verbos[(int) (Math.random() * 12)] + " "
				+ complementos[(int) (Math.random() * 12)] + " ";
	}
	
	public static void hangMan() {
		hangMan(true);
	}
	//TODO: show letters that have been introduced
	public static void hangMan(boolean pintaFrase) {
		// generar frase
		String phrase = generateRandomPhrase();
		if(pintaFrase) {
			System.out.println("la frase es: " + phrase);
		}
		String letters = "";
		String character = "";
		// pedir nombre usuario
		String userName = Utilidades.pideDatoCadena("Ingresa tu nombre");
		// inicializar vidas
		int attemps = 7;
		System.out.println(userName + " vamos a jugar ahorcado, buena suerte!");
		// un ciclo mientras tenga vida o encuentre la frase

		while (attemps > 0) {
			System.out.println("Tienes " + attemps + " vidas");
			printPhraseHangMan(phrase, letters);
			character = Utilidades.pideDatoCadena("Ingresa una letra:");
			letters = letters.concat(character);
			if (!phrase.contains(character)) {
				attemps--;
			}
			//comentario
			if (wasPhraseFound(phrase, letters)) {
				System.out.println("Felicidades " + userName + " has ganado");
				break;
			}
			showLetters(letters);
		}

		if(attemps == 0) {
			System.out.println("Que pena "+userName+", has perdido!");
		}

	}
	
	public static void showLetters(String letters) {
		System.out.print("\nLas letras que has introducido son: ");
		for (int i = 0; i < letters.length(); i++) {
			System.out.print(letters.charAt(i)+" ");
		}
		System.out.println();
	}

	public static boolean wasPhraseFound(String phrase, String letters) {
		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) != ' ' && !letters.contains(String.valueOf(phrase.charAt(i)))) {
				return false;
			}
		}
		return true;
	}

	public static void printPhraseHangMan(String phrase, String letters) {
		for (int i = 0; i < phrase.length(); i++) {
			if (letters.contains(String.valueOf(phrase.charAt(i)))) {
				System.out.print(phrase.charAt(i));
			} else if (phrase.charAt(i) == ' ') {
				System.out.print(" ");
			} else {
				System.out.print("_");
			}
		}
		System.out.println();
	}
}
