package es.cursojava.hibernate.ejercicio1;

import java.util.Arrays;
import java.util.List;

import es.cursojava.hibernate.ejercicio1.dao.CursoDAO;
import es.cursojava.hibernate.ejercicio1.entites.Curso;
import es.cursojava.utils.Utilidades;

public class Ejercicio1Hibernate {

	public static void main(String[] args) {
		insertarCursos();
		listarCursos();
		obtenerCursoPorId();
	}
	
	private static void insertarCursos() {
		System.out.println("Insertando cursos");
		Curso curso1 = new Curso("C1", "Curso 1" , 100);
		Curso curso2 = new Curso("C2", "Curso 2" , 100);
		Curso curso3 = new Curso("C3", "Curso 3" , 100);
		
		List<Curso> cursos = Arrays.asList(curso1,curso2, curso3);
		
		System.out.println("Insertando "+cursos.size() + " cursos");
		CursoDAO dao = new CursoDAO();
		for (Curso curso : cursos) {
			System.out.println("Insertando curso "+curso.getCodigo());
			dao.guardarCurso(curso);
		}
		dao.commitTransaction();
		System.out.println("Cursos insertados");
	}

	private static void listarCursos() {
		System.out.println("Listando cursos");
		CursoDAO dao = new CursoDAO();
		List<Curso> cursos = dao.obtenerTodosLosCursos();
		for (Curso curso : cursos) {
			System.out.println("Curso: "+curso.getCodigo()+" - "+curso.getNombre());
		}
		dao.commitTransaction();
	}
	
	
	private static void obtenerCursoPorId() {
		int id = Utilidades.pideDatoNumerico("Introduce el id del curso a buscar: ");
		CursoDAO dao = new CursoDAO();
		Curso curso = dao.obtenerCursoPorId( Long.valueOf(id));
		if (curso != null) {
			System.out.println("Curso encontrado: "+curso.getCodigo()+" - "+curso.getNombre());
		} else {
			System.out.println("No se ha encontrado ningun curso con id "+id);
		}
		dao.commitTransaction();
	}
	
}
