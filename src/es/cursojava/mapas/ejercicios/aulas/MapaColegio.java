package es.cursojava.mapas.ejercicios.aulas;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import es.cursojava.oo.Alumno;

public class MapaColegio {

	public static void main(String[] args) {
		List<Alumno> alumnos = generaAlumnos();
		
		Map<String,List<Alumno>> aulas = new HashMap<>();
		aulas.put("aula1",alumnos.subList(0, 2));
		aulas.put("aula2",alumnos.subList(2, 3));
		aulas.put("aula3",alumnos.subList(3, 7));
		
		List<Alumno> alumnosAula1 = aulas.get("aula3");
		System.out.println(alumnosAula1.size());
		System.out.println("====================================");
		Collection<List<Alumno>> listasAlumnos = aulas.values();
		int totalAlumnos = 0;
		for (List<Alumno> list : listasAlumnos) {
			totalAlumnos += list.size();
			System.out.println("Tamaño: "+list.size());
			for (Alumno a : list) {
				System.out.println(a);
			}
		}
		System.out.println("Tamaño total: "+totalAlumnos);
		
		
		Set<String> nombreAulas = aulas.keySet();
		for (String aula : nombreAulas) {
			System.out.print(aula);
			System.out.println(aulas.get(aula).size());
		}
		
	}
	
	static List<Alumno> generaAlumnos(){
		Alumno alumno1 = new Alumno("A1", "111A", 7.5);
		Alumno alumno2 = new Alumno("A2", "222B", 2.5);
		Alumno alumno3 = new Alumno("A3", "333C", 3.5);
		Alumno alumno4 = new Alumno("A4", "444D", 4.5);
		Alumno alumno5 = new Alumno("A5", "555E", 5.5);
		Alumno alumno6 = new Alumno("A6", "666F", 6.5);
		Alumno alumno7 = new Alumno("A7", "777G", 8.5);
		Alumno alumno8 = new Alumno("A8", "333C", 3.5);
		Alumno alumno9 = new Alumno("A9", "444D", 4.5);
		Alumno alumno10 = new Alumno("A10", "555E", 5.5);
		Alumno alumno11 = new Alumno("A11", "666F", 6.5);
		Alumno alumno12 = new Alumno("A12", "777G", 8.5);
		
		List<Alumno> alumnos = Arrays.asList(alumno1,alumno2,alumno3,alumno4,
				alumno5,alumno6,alumno7,alumno8,alumno9,alumno10,alumno11,alumno12,alumno7);
		
		return alumnos;
	}

}
