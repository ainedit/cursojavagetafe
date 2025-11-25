package es.cursojava.hibernate.ejercicio1.dao;

import java.util.List;

import org.hibernate.Session;

import es.cursojava.hibernate.ejercicio1.entites.Curso;
import es.cursojava.utils.HibernateUtil;

public class CursoDAO {
	
	private Session session;
	
	public CursoDAO() {
		session = HibernateUtil.getSession();
	}
	
	public void guardarCurso(Curso curso) {
		session.persist(curso);
	}
	
	public void eliminarCurso() {
		
	}

	public void actualizarCurso() {
		
	}
	
	public void obtenerCursoPorId() {
		
	}
	
	public List<Curso> obtenerTodosLosCursos() {
		
		return session.createQuery("from Curso", Curso.class).list();
		
	}
	
}
