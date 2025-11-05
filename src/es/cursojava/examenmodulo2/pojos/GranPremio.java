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
		// Crear carreras
		Carrera carrera1 = new Carrera("Carrera1", 2000);
		Carrera carrera2 = new Carrera("Carrera2", 3000);

		Jinete jinete = new Jinete("Jinete1", 22, 4);
		Caballo caballo1 = UtilsCaballos.crearCaballoAleatorio("Pitufo", jinete);

		Jinete jinete2 = new Jinete("Jinete2", 20, 6);
		Caballo caballo2 = UtilsCaballos.crearCaballoAleatorio("Perdigon", jinete2);

		Jinete jinete3 = new Jinete("Jinete3", 25, 2);
		Caballo caballo3 = UtilsCaballos.crearCaballoAleatorio("Relámpago", jinete3);

		List<Caballo> caballos = Arrays.asList(caballo1, caballo2);
		carrera1.setCaballosParticipantes(caballos);
		carrera2.setCaballosParticipantes(caballos);

		Carrera carrera3 = new Carrera("Carrera3", 3000, caballos);
		// carrera3.addCaballo(caballo3);
		// carrera3.getCaballosParticipantes().add(caballo3);

		this.carreras = Arrays.asList(carrera1, carrera2, carrera3);
	}

	public void empezarGranPremio() {
		System.out.println("Empezando el Gran Premio "+ this.nombre);
		
		for (Carrera carrera : this.carreras) {
			try {
				System.out.println("\nEmpezando la carrera "+carrera.getNombre() + " con "+carrera.getDistanciaObjetivo() +" metros");
				Map<String,Caballo> mapaCaballos = mostrarInfoCaballos(carrera.getCaballosParticipantes());
				//Los apostantes realizan sus apuestas
				apuestas(carrera, mapaCaballos);
				//Iniciar carrera con el avance de los caballos
				Caballo caballoGanador = iniciarCarrera(carrera);
				System.out.println("Mirar si los apostantes han ganado");
				//Mirar si los apostantes han ganado
				gestionApuestas(carrera.getApuestas(),caballoGanador);
			}catch(Exception e) {
				System.out.println("Error "+e.getMessage());
			}
		}
		//Resumen
		
	}
	
	/**
	 * 
	 * @param apuestas
	 * @param caballoGanador
	 */
	private void gestionApuestas (List<Apuesta> apuestas, Caballo caballoGanador) {
		
		for (Apuesta apuesta : apuestas) {
			if(apuesta.getCaballo()==caballoGanador) {
				double importeApuesta = apuesta.getImporte()*5;
				System.out.println("El apostante "+ apuesta.getApostante().getNombre()
						+" ha ganado " + importeApuesta);
				apuesta.getApostante().actualizarSaldo(importeApuesta);
				System.out.println("El apostante "+ apuesta.getApostante().getNombre()
						+" tiene " + apuesta.getApostante().getSaldo());
			}
		}
		
		
	}
	
	private Caballo iniciarCarrera (Carrera carrera) {
		
		boolean carreraTerminada=false;
		Caballo caballoGanador=null;
		
		do {
			for (Caballo caballo : carrera.getCaballosParticipantes()) {
				caballo.aplicarAvance(caballo.calcularAvanceTurno());
				
				if (caballo.getMetrosRecorridos()>=carrera.getDistanciaObjetivo()) {
					carreraTerminada=true;
					caballoGanador = caballo;
					System.out.println("Carrera terminada, ha ganado "+caballo.getNombre());
					break;
				}
			}
			
		}while(!carreraTerminada);
		
		return caballoGanador;
	}
	
	//Muestro información de los caballos y devuelve mapa con los caballos y su nombre como clave
	private Map<String,Caballo> mostrarInfoCaballos (List<Caballo> caballos) {
		Map<String,Caballo> mapaCaballos = new HashMap<>();
		for (Caballo caballo : caballos) {
			System.out.println("\tCaballo " + caballo.getNombre() + " con el jinete: " + caballo.getJinete().getNombre());
			mapaCaballos.put(caballo.getNombre(),caballo);
		}
		return mapaCaballos;
	}
	
	public void apuestas (Carrera carrera, Map<String,Caballo> mapaCaballos) {
		for(Apostante apostante : this.apostantes) {
			System.out.println(apostante.getNombre() + " tienes " +apostante.getSaldo());
			String nombreCaballo = Utilidades.pideDatoCadena("Caballo por el que apuestas");
			Caballo caballoApostado = mapaCaballos.get(nombreCaballo);
			double cantidad = Utilidades.pideDatoNumerico("Cantidad a apostar");
			
			apostante.actualizarSaldo(-cantidad);
			System.out.println("El apostante se queda con "+apostante.getSaldo());
			Apuesta apuesta = new Apuesta(apostante,caballoApostado, cantidad);
			carrera.addApuesta(apuesta);
		}
	}
	
	
}
