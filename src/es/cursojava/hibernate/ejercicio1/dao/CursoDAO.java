package es.cursojava.hibernate.ejercicio1.dao;

import java.util.List;

import es.cursojava.hibernate.ejercicio1.entites.Curso;

public interface CursoDAO {

	public void guardarCurso(Curso curso);
	
	public void eliminarCurso(Long id);
	
	public void actualizarCurso(Curso curso);
	
	public Curso obtenerCursoPorId(Long id);
	
	public List<Curso> obtenerTodosLosCursos();
	
	public List<Curso> obtenerCursosActivos();
	
	public List<Curso> obtenerCursosPorNombre(String nombre);
	
	
}
