package es.cursojava.mapas.ejercicios.aulas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import es.cursojava.oo.Alumno;

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

		
		mostrarDatosColegios(colegios);
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




