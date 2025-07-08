package es.cursojava.inicio.strings;

public class FuncionesStrings {

	public static void main(String[] args) {
		
		String nombre = "Marta";
		String nombre2 = "Eva";
		String nombre3 = null;
		
		nombre3 = nombre2;
		nombre2 = nombre;
		nombre2.toUpperCase();
		String nombre4 = nombre3.toUpperCase();
		System.out.println(nombre4);//EVA
		System.out.println(nombre);//Marta
		
		System.out.println("============================");
		
		System.out.println(nombre.charAt(nombre.length()-1));
		
		System.out.println("Tenerife".toLowerCase().contains("te"));
		
		System.out.println(nombre2.endsWith("va"));
		System.out.println(nombre2.startsWith("Ma"));
		
		String cadena = "Esto es una prueba de Strings";
		System.out.println(cadena.indexOf("e"));
		System.out.println(cadena.lastIndexOf("e"));
		
		System.out.println(cadena.replace("a", "A"));
		
		System.out.println("============================");
		cadena = "    e r t ";
		System.out.println(cadena.isBlank());
		System.out.println(cadena.isEmpty());
		
		System.out.println("'" + cadena + "'");
		System.out.println("'" + cadena.strip() + "'");
		System.out.println("'" + cadena.replace(" ","") + "'");
		
		
		cadena = "Hola Mundo desde Getafe";
		System.out.println(cadena.substring(5));
		System.out.println(cadena.substring(5,12));
		
		System.out.println(cadena.substring(cadena.lastIndexOf(" ")+1));
		
	}

}
