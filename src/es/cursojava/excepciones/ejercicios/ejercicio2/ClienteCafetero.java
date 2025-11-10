package es.cursojava.excepciones.ejercicios.ejercicio2;

import es.cursojava.excepciones.ejercicios.ejercicio2.exceptions.TooColdTemperatureException;
import es.cursojava.excepciones.ejercicios.ejercicio2.exceptions.TooHotTemperatureException;

public class ClienteCafetero extends Cliente {
	private final int TEMPERATURA_MAXIMA=80;
	private final int TEMPERATURA_MINIMA=20;
	
	public ClienteCafetero(String nombre) {
		super(nombre);
	}

	public void tomarCafe (TazaCafe taza) throws TooHotTemperatureException, TooColdTemperatureException{
		
		if (taza.getTemperatura()>TEMPERATURA_MAXIMA) {
			throw new TooHotTemperatureException("El café está muy caliente "+taza.getTemperatura());
		}else if (taza.getTemperatura()<TEMPERATURA_MINIMA) {
			throw new TooColdTemperatureException("El café está muy frío "+taza.getTemperatura());
		}else {
			System.out.println("El cliente "+this.getNombre() + " se está tomando el café tranquilamente ");
		}
		
	}
}
