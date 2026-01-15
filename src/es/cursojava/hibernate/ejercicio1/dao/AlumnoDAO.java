package es.cursojava.hibernate.ejercicio1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import es.cursojava.hibernate.ejercicio1.entites.Alumno;
import es.cursojava.hibernate.ejercicio1.entites.Aula;
import es.cursojava.utils.HibernateUtil;

public class AlumnoDAO {

	private Session session;
	private Transaction transaction;
	
	public AlumnoDAO() {
		session = HibernateUtil.getSessionFactory();
		transaction = session.beginTransaction();
	}
	
	public Aula obtenerAulaPorNombreAlumno(String nombreAlumno) {
		Query<Alumno> query = session.createQuery("from Alumno where nombre = :nombreAlumno", Alumno.class);
		query.setParameter("nombreAlumno", nombreAlumno);

		return query.uniqueResult().getCurso().getAula();
	}
	
	public String obtenerCodigoAulaPorNombreAlumno(String nombreAlumno) {
		Query<String> query = session.createQuery("select a.curso.aula.codigoAula "
				+ "from Alumno a where nombre = :nombreAlumno", String.class);
		
		query.setParameter("nombreAlumno", nombreAlumno);

		return query.uniqueResult();
	}
	
	
	public void guardarAlumno(Alumno alumno) {
		//transaction.begin();
		session.persist(alumno);
		session.flush();
		transaction.commit();
	}
	
	public List<Alumno> obtenerTodosAlumnos() {
		Query<Alumno> query = session.createQuery("from Alumno", Alumno.class);
		List<Alumno> alumnos = query.getResultList();
		
		return alumnos;
	}
}
