package es.cursojava.lambdass;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MainComparaCadenas {

	public static void main(String[] args) {
		
		ComparaCadenas comparaLongitud = s1 -> s1.length() > 5;
		ComparaCadenas contieneTexto = s1 -> { s1 = s1.toLowerCase(); 
											 	return s1.contains("hola"); };
		
											 	
		GeneraMensaje generarMensaje = () -> System.out.println("Este es un mensaje generado con una expresión lambda.");
		generarMensaje.mensaje();
		GeneraMensaje generarMensaje2 = () -> System.out.println(" Otro mensaje diferente generado con una expresión lambda.");
		generarMensaje2.mensaje();									 	
											 	
		String cadena1 = "HolaMundo";
		String cadena2 = "AdiosMundo";
		
		System.out.println("¿La cadena \"" + cadena1 + "\" tiene más de 5 caracteres? " + comparaLongitud.comparar(cadena1));
		System.out.println("¿La cadena \"" + cadena2 + "\" contiene Hola? " + contieneTexto.comparar(cadena2));

		
		List<String> listaColores = new ArrayList<>();
		listaColores.add("Rojo");
		listaColores.add("Verde");
		listaColores.add("Azul");
		
		
		listaColores.forEach(color -> System.out.println("Color: " + color));
		
		listaColores.removeIf(color -> color.startsWith("V"));
		
//		listaColores.stream()
//					 .map(color -> new Alumno(color.toUpperCase())
//		             .filter(alumno -> alumno.getNombre().length() > 4)
//		             .forEach(alumno -> System.out.println(""));
		
		Optional<String> nombreColor = listaColores.stream()
												 .filter(color -> color.equals("Rojo"))
												 .findFirst();
		
		nombreColor.ifPresent(nombre -> System.out.println("Se encontró el color: " + nombre));
		
		
	}

}
