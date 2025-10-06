package es.cursojava.colecciones.ejercicios;

import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

import es.cursojava.oo.Alumno;
import es.cursojava.utils.Utilidades;

public class Ejercicio1 {

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("N1","111A",8);
		Alumno alumno2 = new Alumno("N4","222A",3);
		Alumno alumno3 = new Alumno("N3","333A",4);
		Alumno alumno4 = new Alumno("N4","444A",5);
		Alumno alumno5 = new Alumno("N5","555A",9.6);
		Alumno alumno6 = new Alumno("N6","666A",7);
		Alumno alumno7 = new Alumno("N7","777A",9.5);

		List<Alumno> listaAlumnos = new CopyOnWriteArrayList<Alumno>();
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(null);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);
		
		//mostrarInfoAlumnos(listaAlumnos);
		//mostrarInfoAlumnosSobresalientes(listaAlumnos);
		//mostrarNotaMediaPorNombre(listaAlumnos);
		eliminarSuspensos(listaAlumnos);
		mostrarInfoAlumnos(listaAlumnos);
	}
	
	private static void eliminarSuspensos(List<Alumno> listaAlumnos) {
//		for (int i = 0; i < listaAlumnos.size(); i++) {
//			Alumno alumno = listaAlumnos.get(i);
//			if(alumno.getNotaMedia()<5) {
//				System.out.println("Alumno eliminado "+alumno.getNombre());
//				listaAlumnos.remove(alumno);
//			}
//		}
		
		
		for (Alumno alumno : listaAlumnos) {
			if(alumno.getNotaMedia()<5) {
				listaAlumnos.remove(alumno);
			}
			
		}
		
	}
	
	private static void mostrarInfoAlumnos(List<Alumno> listaAlumnos) {
		
		for (Alumno alumno : listaAlumnos) {
			System.out.println(alumno);
		}
		
	}
	
	private static void mostrarInfoAlumnosSobresalientes(List<Alumno> listaAlumnos) {
		
		for (Alumno alumno : listaAlumnos) {
			if (alumno.getNotaMedia()>9) {
				System.out.println(alumno.getNombre() + " tiene una nota de "+alumno.getNotaMedia());
			}
		}
	}
	
	private static void mostrarNotaMediaPorNombre (List<Alumno> listaAlumnos) {
		String nombreAConsultar = Utilidades.pideDatoCadena("Introduce un nombre");
		double notasAlumnos = 0;
		int contador=0;
		for (Alumno alumno : listaAlumnos) {
			if (alumno!=null && alumno.getNombre()!=null && nombreAConsultar!=null 
					&& alumno.getNombre().equals(nombreAConsultar)) {
				notasAlumnos += alumno.getNotaMedia();
				contador++;
			}
		}
		System.out.println("La nota media de todos los alumnos llamados "+nombreAConsultar + " es "+
				notasAlumnos/contador);
		
	}
	
	

}
