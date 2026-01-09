package es.cursojava.ficheros.ejercicios;

import java.io.File;

import es.cursojava.utils.Utilidades;

public class Ejercicio2Ficheros {
    public static void main(String[] args) {
        String directorio = Utilidades.pideDatoCadena("Introduce directorio");
        File dir = new File(directorio);
        if (dir.exists() && dir.isDirectory()){
        	System.out.println("Es un directorio");
        	showInfoFiles(dir);
        }else {
        	System.out.println("No es un directorio");
        }
    }

    private static void showInfoFiles(File dir) {

        //System.out.println(dir.getPath() +"\\");
        File [] files =  dir.listFiles();
        for (File file : files) {
            if (file.isFile()){
                System.out.print("\t"+file.getName() +"-");
                System.out.print("\t"+file.length() +"-");
                System.out.println("\t"+ (file.isHidden()?"Archivo oculto":"Archivo visible"));
            }
        }
    }

}
