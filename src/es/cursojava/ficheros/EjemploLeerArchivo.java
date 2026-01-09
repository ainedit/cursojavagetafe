package es.cursojava.ficheros;

import java.io.IOException;

public class EjemploLeerArchivo {
	

    public static void main(String[] args) {
        //String nombreArchivo = "D:\\Cursos\\Java\\archivo\\java.txt";
    	String nombreArchivo = "./recursos/joseluis_13112025.txt";
        ArchivoServicio servicio = new ArchivoServicio();

		//System.out.println(servicio.leerArchivo2(nombreArchivo));
        try {
			System.out.println(servicio.leerArchivo3(nombreArchivo));
		} catch (IOException e) {
			System.out.println("Recojo la excepción: "+e.getMessage());
			e.printStackTrace();
		}
    }
}
