package es.cursojava.examenmodulo2.pojos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.cursojava.examenmodulo2.utils.UtilsCaballos;
import es.cursojava.utils.Utilidades;

public class GranPremio {
	private String nombre; 
	private List<Carrera> carreras;
	private List<Apostante> apostantes;
	
	public GranPremio(String nombre, List<Carrera> carreras) {
		super();
		this.nombre = nombre;
		this.carreras = carreras;
		this.apostantes = new ArrayList<Apostante>();
	}

	public GranPremio(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(List<Carrera> carreras) {
		this.carreras = carreras;
	}

	public List<Apostante> getApostantes() {
		return apostantes;
	}

	public void setApostantes(List<Apostante> apostantes) {
		this.apostantes = apostantes;
	}

	@Override
	public String toString() {
		return "GranPremio [nombre=" + nombre + ", carreras=" + carreras + ", apostantes=" + apostantes + "]";
	}
	
	
	public void init() {
		crearCarreras();
		this.apostantes = UtilsCaballos.crearApostantes();
	}
	
	private void crearCarreras() {
		//Crear carreras
		Carrera carrera1 = new Carrera("Carrera1",500);
		Carrera carrera2 = new Carrera("Carrera2",700);
		
		Jinete jinete = new Jinete("Jinete1",22,4);
		Caballo caballo1 = UtilsCaballos.crearCaballoAleatorio("Pitufo",jinete);
		
		Jinete jinete2 = new Jinete("Jinete2",20,6);
		Caballo caballo2 = UtilsCaballos.crearCaballoAleatorio("Perdigon",jinete2);
		
		Jinete jinete3 = new Jinete("Jinete3",25,2);
		Caballo caballo3 = UtilsCaballos.crearCaballoAleatorio("Relámpago",jinete3);
		
		List<Caballo> caballos = Arrays.asList(caballo1,caballo2);
		carrera1.setCaballosParticipantes(caballos);
		carrera2.setCaballosParticipantes(caballos);
		
		Carrera carrera3 = new Carrera("Carrera3",700,caballos);
		//carrera3.addCaballo(caballo3);
		//carrera3.getCaballosParticipantes().add(caballo3);
		
		
		this.carreras = Arrays.asList(carrera1,carrera2,carrera3);
	}
	
	
	public void empezarGranPremio() {
		System.out.println("Empezando el Gran Premio "+ this.nombre);
		
		for (Carrera carrera : this.carreras) {
			System.out.println("\nEmpezando la carrera "+carrera.getNombre());
			Map<String,Caballo> mapaCaballos = new HashMap<>();
			//Muestro información de los caballos
			for (Caballo caballo : carrera.getCaballosParticipantes()) {
				System.out.println("\tCaballo " + caballo.getNombre() + " con el jinete: " + caballo.getJinete().getNombre());
				mapaCaballos.put(caballo.getNombre(),caballo);
			}
			
			//Los apostantes realizan sus apuestas
			for(Apostante apostante : this.apostantes) {
				System.out.println(apostante.getNombre() + " tienes " +apostante.getSaldo());
				String nombreCaballo = Utilidades.pideDatoCadena("Caballo por el que apuestas");
				Caballo caballoApostado = mapaCaballos.get(nombreCaballo);
				double cantidad = Utilidades.pideDatoNumerico("Cantidad a apostar");
				
				Apuesta apuesta = new Apuesta(apostante,caballoApostado, cantidad);
				carrera.addApuesta(apuesta);
			}
			
			//Iniciar carrera con el avance de los caballos
			
			
			
			//Mirar si los apostantes han ganado
			
			
		}
		
		
		//Resumen
		
		
		
	}

}
