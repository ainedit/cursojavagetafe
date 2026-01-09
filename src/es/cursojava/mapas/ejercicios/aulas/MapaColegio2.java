package es.cursojava.mapas.ejercicios.aulas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;
import es.cursojava.oo.Alumno;
import es.cursojava.oo.Persona;

public class MapaColegio2 {

	public static void main(String[] args) {
		Colegio colegio1 = new Colegio("Cole1", "Dir1");
		Colegio colegio2 = new Colegio("Cole2", "Dir2");
		
		
		List<Alumno> alumnos = MapaColegio.generaAlumnos();
		
		Map<String,List<Alumno>> aulasCole3 = new HashMap<>();
		aulasCole3.put("aula1",alumnos.subList(0, 2));
		aulasCole3.put("aula2",alumnos.subList(2, 3));
		aulasCole3.put("aula3",alumnos.subList(3, 7));
		Colegio colegio3 = new Colegio("Cole3", "Dir3",aulasCole3);
		
		Map<String,List<Alumno>> aulasCole2 = new HashMap<>();
		aulasCole2.put("aula1", alumnos.subList(7, 10));
		colegio2.setAulas(aulasCole2);
		
		
		List<Colegio> colegios = Arrays.asList(colegio1,colegio2, colegio3);
		for (Colegio colegio : colegios) {
			if (colegio.getAulas().isEmpty()) {
				System.out.println(colegio.getNombre() +" sin aulas");
				Map<String,List<Alumno>> aulasCole1 = new HashMap<>();
				aulasCole1.put("aula1", alumnos.subList(10, 11));
				aulasCole1.put("aula2", alumnos.subList(11, 12));
				aulasCole1.put("aula3", alumnos.subList(12, 13));
				
				colegio.setAulas(aulasCole1);
			}
		}
		Alumno alumnoN = new Alumno("AN", "222N", 9.5);
		Alumno alumnoN1 = new Alumno("AN1", "222N1", 6.5);
		//colegio2.getAulas().get("aula1").add(alumnoN);//Añadimos alumnos a un aula que ya existe
		
		colegio2.getAulas().put("aula2", new ArrayList(Arrays.asList(alumnoN)));
		colegio2.getAulas().get("aula2").add(alumnoN1);
		//System.out.println(colegio2.getAulas().get("aula2").size());

		
		//mostrarDatosColegios(colegios);
		mostrarColegioNotaMediaMayor(colegios);
		
		
	}
	
	private static void mostrarColegioNotaMediaMayor(List<Colegio> colegios) {
		double notaMediaMaxima = 0;
		Colegio mejorColegio= null;
		for (Colegio colegio : colegios) {
			double notaMediaColegio = 0;
			int contadorAlumnos= 0;
			System.out.println(colegio.getNombre());
			Map<String,List<Alumno>> aulas = colegio.getAulas();
			Collection<List<Alumno>> listadosAlumnos = aulas.values();
			for (List<Alumno> alumnos : listadosAlumnos) {
				for (Alumno alumno : alumnos) {
					//System.out.println(alumno);
					notaMediaColegio+=alumno.getNotaMedia();
					contadorAlumnos++;
				}
			}
			notaMediaColegio = notaMediaColegio/contadorAlumnos;
			System.out.println(notaMediaColegio);
			if (notaMediaColegio>notaMediaMaxima) {
				notaMediaMaxima = notaMediaColegio;
				mejorColegio = colegio;
			}
			
		}
		System.out.println(mejorColegio.getNombre() +" tiene la nota media más alta");
		
		
	}
	
	
	
	private static void mostrarDatosColegios (List<Colegio> colegios) {
		
		for (Colegio colegio : colegios) {
			System.out.println(colegio);
			Map<String,List<Alumno>> aulas= colegio.getAulas();
			Set<String> nombresAulas =  aulas.keySet();
			for (String nombreAula : nombresAulas) {
				System.out.println("\t"+nombreAula);
				List<Alumno> alumnos = aulas.get(nombreAula);
				for (Alumno alumno : alumnos) {
					System.out.println("\t\t"+alumno);
				}
			}
		}
		
		
		
	}

}




