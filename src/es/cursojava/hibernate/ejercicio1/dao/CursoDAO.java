package es.cursojava.hibernate.ejercicio1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.hibernate.ejercicio1.entites.Curso;
import es.cursojava.utils.HibernateUtil;

public class CursoDAO {
	
	private Session session;
	private Transaction transaction;
	
	public CursoDAO() {
		session = HibernateUtil.getSessionFactory();
		transaction = session.beginTransaction();
	}
	
	public void guardarCurso(Curso curso) {
		session.persist(curso);
	}
	
	public void eliminarCurso() {
		
	}

	public void actualizarCurso() {
		
	}
	
	public Curso obtenerCursoPorId(Long id) {
		return session.get(Curso.class, id);
	}
	
	public List<Curso> obtenerTodosLosCursos() {
		
		return session.createQuery("from Curso", Curso.class).list();
		
	}

	public void commitTransaction() {
		transaction.commit();
	}
	
	
	
}
