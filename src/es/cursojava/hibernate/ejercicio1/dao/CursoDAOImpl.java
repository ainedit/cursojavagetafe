package es.cursojava.hibernate.ejercicio1.dao;

import java.time.LocalDate;
import java.util.ArrayList;
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

		Query<Curso> query = session.createQuery("from Curso c where c.activo = true", Curso.class);

		return query.list();
	}

	@Override
	public List<Curso> obtenerCursosPorNombre(String nombreCurso) {
		// En HQL no se deben poner los comodines (%) dentro de la cadena de la consulta
		// junto al placeholder.
		// Uso correcto: '... where nombre like :nombreParam' y paso '%valor%' al
		// parámetro.
		Query<Curso> query = session.createQuery("from Curso c where c.nombre like :nombreParam", Curso.class);
		query.setParameter("nombreParam", "%" + nombreCurso.trim() + "%");

		return query.list();
	}

	public List<Curso> buscarPorRangoFechaInicio(java.time.LocalDate desde, java.time.LocalDate hasta) {
		System.out.println("Buscando cursos desde " + desde + " hasta " + hasta);

		Query<Curso> query = session.createQuery("from Curso c where c.fechaInicio >= :desdeFecha and "
				+ "c.fechaInicio <= :hastaFecha", Curso.class);
		query.setParameter("desdeFecha", desde);
		query.setParameter("hastaFecha", hasta);
		
		return query.list();

	}
	
	public List<Curso> informacionPorCategoriaYFechaIncio(String categoria, LocalDate fechaInicio) {
		System.out.println("Categoria: " + categoria + ", Fecha Inicio: " + fechaInicio);
//		Query<Curso> query = session.createQuery(
//				"from Curso where categoria = :categoriaParam and fechaInicio >= :fechaInicioParam", Curso.class);
//		query.setParameter("categoriaParam", categoria);
//		query.setParameter("fechaInicioParam", fechaInicio);

		Query<Curso> query = session.createQuery("from Curso c where c.fechaInicio >= :fechaInicioParam", Curso.class);
		query.setParameter("fechaInicioParam", fechaInicio);

		return query.list();
	}

	@Override
	public Curso obtenerCursosPorCodigo(String codigo) {
		Query<Curso> query = session.createQuery("from Curso c where c.codigo = :codigoCurso", Curso.class);
		query.setParameter("codigoCurso", codigo);
		
		return query.uniqueResult();
	}

	@Override
	public List<Curso> obtenerCursosPorCategoriaYFechaInicio(String categoria, LocalDate fechaInicio) {
		Query<Curso> query = session.createQuery("from Curso c where c.categoria = :categoriaCurso"
				+ " and c.fechaInicio >= :fechaInicioCurso", Curso.class);
		query.setParameter("categoriaCurso", categoria);
		query.setParameter("fechaInicioCurso", fechaInicio);
		
		return query.list();
	}

	@Override
	public List<Curso> obtenerCursosPorNivelYHorasYFechaInicio(String nivel, int numHoras, LocalDate fechaInicio) {
		Query<Curso> query = session.createQuery("from Curso c where c.nivel = :nivelCurso"
				+ " and c.horasTotales >= :numHorasCurso"
				+ " and c.fechaInicio >= :fechaInicioCurso", Curso.class);
		
		query.setParameter("nivelCurso", nivel);
		query.setParameter("numHorasCurso", numHoras);
		query.setParameter("fechaInicioCurso", fechaInicio);
		
		return query.list();
	}
	
	
	public List<Curso> obtenerNombreDescripcionCursos() {
		List<Object[]> datos = session.createQuery("select c.nombre, c.descripcion from Curso c").list();
		List<Curso> cursos = new ArrayList<>();
		for (Object[] fila : datos) {
			String nombre = (String) fila[0];
			String descripcion = (String) fila[1];
			Curso curso = new Curso(nombre, descripcion);
			cursos.add(curso);
			System.out.println("Nombre: " + nombre + ", Descripcion: " + descripcion);
		}
		
		
		return cursos;
	}
	
	
	public List<Curso> obtenerNombreDescripcionCursos2() {
		String hqlQuery = "select new "+
				"es.cursojava.hibernate.ejercicio1.entites.Curso(c.nombre, c.descripcion ) " +
				"from Curso c order by c.nombre asc";
		
		List<Curso> cursos = session.createQuery(hqlQuery,Curso.class).setMaxResults(3).list();
		
		return cursos;
	}


}