package es.cursojava.hibernate.ejercicio1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import es.cursojava.hibernate.ejercicio1.entites.Curso;
import es.cursojava.utils.HibernateUtil;

public class CursoDAOImpl implements CursoDAO {

	private Session session;
	private Transaction transaction;

	public CursoDAOImpl() {
		session = HibernateUtil.getSessionFactory();
		transaction = session.beginTransaction();
	}

	public void guardarCurso(Curso curso) {
		session.persist(curso);
	}

	public void eliminarCurso(Long id) {

	}

	public void actualizarCurso(Curso curso) {

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

	@Override
	public List<Curso> obtenerCursosActivos() {

		Query<Curso> query = session.createQuery("from Curso where activo = true", Curso.class);

		return query.list();
	}

	@Override
	public List<Curso> obtenerCursosPorNombre(String nombre) {
		// Si no se proporciona nombre, devolvemos todos los cursos
		if (nombre == null || nombre.trim().isEmpty()) {
			return obtenerTodosLosCursos();
		}

		// En HQL no se deben poner los comodines (%) dentro de la cadena de la consulta
		// junto al placeholder.
		// Uso correcto: '... where nombre like :nombreParam' y paso '%valor%' al
		// parámetro.
		Query<Curso> query = session.createQuery("from Curso where nombre like :nombreParam", Curso.class);
		query.setParameter("nombreParam", "%" + nombre.trim() + "%");

		return query.list();
	}

	public List<Curso> buscarPorRangoFechaInicio(java.time.LocalDate desde, java.time.LocalDate hasta) {
		System.out.println("Buscando cursos desde " + desde + " hasta " + hasta);

		return session.createQuery("from Curso c where c.fechaInicio >= :desde and c.fechaInicio <= :hasta",
				Curso.class).setParameter("desde", desde).setParameter("hasta", hasta).getResultList();

	}

}