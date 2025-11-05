package es.cursojava.examenmodulo2.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import es.cursojava.examenmodulo2.pojos.Apostante;
import es.cursojava.examenmodulo2.pojos.Caballo;
import es.cursojava.examenmodulo2.pojos.Jinete;

public class UtilsCaballos {
	public static Caballo crearCaballoAleatorio(String nombreBase, Jinete jinete) {
		Random random = new Random();
		
		double peso = random.nextDouble(200,300);
		int velocidad = random.nextInt(30,80);
		int experiencia = random.nextInt(1,10);
		
		Caballo caballo = new Caballo(nombreBase,peso,velocidad,experiencia, jinete);
		caballo.imprimeDatos();
		
		return caballo;
	}
	
	public static List<Apostante> crearApostantes() {
		Apostante apostante1 = new Apostante("Apostante1", 34,1000);
		Apostante apostante2 = new Apostante("Apostante2", 14,1000);
		List<Apostante> apostantes = new ArrayList<Apostante>();
		apostantes.add(apostante2);
		apostantes.add(apostante1);
		
		return apostantes;
	}
}

