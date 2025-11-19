package es.cursojava.examen.modulo2final.parte2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Parte2LecturaFichero {
	private int contador;

	public static void main(String[] args) {
		Parte2LecturaFichero parte2 = new Parte2LecturaFichero();
		try {
			List<String> lines = parte2.leerArchivo("./recursos/application_small.log");
			System.out.println(lines.size());
			for (String linea : lines) {
				parte2.contarPalabraJava(linea);
			}
			System.out.println("java aparece " + parte2.contador + " veces");
			
			parte2.gestionarMapa(lines);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void gestionarMapa(List<String> lineas) {
		Map<Integer, String> mapaFichero = new HashMap<>();
		int contador = 1;
		for (String linea : lineas) {
			mapaFichero.put(contador++, linea);
		}
		
		
		Set<Entry<Integer,String>> entry =	mapaFichero.entrySet();
		for (Entry<Integer, String> numeroYLinea : entry) {
			int numLinea = numeroYLinea.getKey();
			String linea = numeroYLinea.getValue();
			if (linea.toLowerCase().contains("java")) {
				System.out.println("La línea "+ numLinea +" contiene la palabra java");
			}
			
			int suma = numLinea + linea.length();
			System.out.println("La suma total de la línea "+ numLinea + " es "+ suma);
		}
		
		
		
	}
	

	public List<String> leerArchivo(String nombre) throws IOException {
		Path path = Paths.get(nombre);

		List<String> lines = Files.readAllLines(path);

		return lines;
	}

	public void contarPalabraJava(String linea) {
		String[] palabras = linea.split("java");
//		System.out.println(linea);
//		System.out.println(palabras.length);
		this.contador+= ((palabras.length)-1);
//		for (String string : palabras) {
//			System.out.println(string);
//		}
//		for (String palabra : palabras) {
//			if (palabra.toLowerCase().contains("java"))
//				this.contador++;
//		}
	}

}
