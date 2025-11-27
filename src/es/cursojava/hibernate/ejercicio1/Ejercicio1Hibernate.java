package es.cursojava.hibernate.ejercicio1;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.cursojava.hibernate.ejercicio1.dao.CursoDAOImpl;
import es.cursojava.hibernate.ejercicio1.entites.Curso;
import es.cursojava.utils.Utilidades;
import es.cursojava.utils.UtilidadesFicheros;

public class Ejercicio1Hibernate {

	public static void main(String[] args) {
		//insertarCursos(generarCursosDesdeFichero());
		//mostrarCursosPorNombre();
		//mostrarCursosActivos();
		//insertarCursos();
//		listarCursos();
//		obtenerCursoPorId();
		filtrarPorFechas();
		
	}
	
	public static void filtrarPorFechas() {

		CursoDAOImpl dao = new CursoDAOImpl();

        // Definir el rango de fechas
        LocalDate fechaDesde = LocalDate.of(2025, 1, 1);
        LocalDate fechaHasta = LocalDate.of(2025, 2, 1);

        // Llamar al método
        List<Curso> cursos = dao.buscarPorRangoFechaInicio(fechaDesde, fechaHasta);

        // Mostrar resultados
        System.out.println("Cursos con fecha de inicio entre " + fechaDesde + " y " + fechaHasta + ":");
        cursos.forEach(System.out::println);
    }
	
	private static void mostrarCursosActivos () {
		CursoDAOImpl dao = new CursoDAOImpl();
		List<Curso> cursos = dao.obtenerCursosActivos();
		for (Curso curso : cursos) {
			System.out.println("Curso activo: "+curso.getCodigo()+" - "+curso.getNombre());
		}
		dao.commitTransaction();
	}
	
	private static void mostrarCursosPorNombre () {
		String nombre = Utilidades.pideDatoCadena("Introduce el nombre del curso a buscar: ");
		CursoDAOImpl dao = new CursoDAOImpl();
		List<Curso> cursos = dao.obtenerCursosPorNombre(nombre);
		for (Curso curso : cursos) {
			System.out.println("Curso activo: "+curso.getCodigo()+" - "+curso.getNombre());
		}
		dao.commitTransaction();
	}
	
	private static List<Curso> generarCursosDesdeFichero() {
		String rutaFichero = "./cursos.txt";
		List<Curso> cursos = new ArrayList<Curso>();
		try {
			List<String> lineas = UtilidadesFicheros.leerFichero(rutaFichero);
			for (String linea : lineas) {
				System.out.println("Procesando linea: "+linea);
				String [] datos = linea.split("\\|");
				System.out.println("Datos obtenidos: "+ Arrays.toString(datos));
				
				String codigo = datos[0];
				String nombre = datos[1];
				String descripcion = datos[2];
				Integer horasTotales = Integer.valueOf( datos[3] );
				Boolean activo = Boolean.valueOf( datos[4] );
				String nivel = datos[5];
				String categoria = datos[6];
				BigDecimal precio = new BigDecimal( datos[7] );
				LocalDate fechaInicio = LocalDate.parse( datos[8] );
				LocalDate fechaFinal = LocalDate.parse( datos[9] );
				
				Curso curso = new Curso(codigo, nombre, descripcion, 
						horasTotales,
						activo, nivel, categoria, precio, 
						fechaInicio, fechaFinal);
				
				cursos.add(curso);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cursos;
	}
	
	
	private static void insertarCursos() {
		System.out.println("Insertando cursos");
		Curso curso1 = new Curso("C1", "Curso 1" , 100);
		Curso curso2 = new Curso("C2", "Curso 2" , 100);
		Curso curso3 = new Curso("C3", "Curso 3" , 100);
		
		List<Curso> cursos = Arrays.asList(curso1,curso2, curso3);
		
		insertarCursos(cursos);
	}
	
	
	private static void insertarCursos (List<Curso> cursos) {
		System.out.println("Insertando "+cursos.size() + " cursos");
		CursoDAOImpl dao = new CursoDAOImpl();
		for (Curso curso : cursos) {
			System.out.println("Insertando curso "+curso.getCodigo());
			dao.guardarCurso(curso);
		}
		dao.commitTransaction();
		System.out.println("Cursos insertados");
	}

	private static void listarCursos() {
		System.out.println("Listando cursos");
		CursoDAOImpl dao = new CursoDAOImpl();
		List<Curso> cursos = dao.obtenerTodosLosCursos();
		for (Curso curso : cursos) {
			System.out.println("Curso: "+curso.getCodigo()+" - "+curso.getNombre());
		}
		dao.commitTransaction();
	}
	
	
	private static void obtenerCursoPorId() {
		int id = Utilidades.pideDatoNumerico("Introduce el id del curso a buscar: ");
		CursoDAOImpl dao = new CursoDAOImpl();
		Curso curso = dao.obtenerCursoPorId( Long.valueOf(id));
		if (curso != null) {
			System.out.println("Curso encontrado: "+curso.getCodigo()+" - "+curso.getNombre());
		} else {
			System.out.println("No se ha encontrado ningun curso con id "+id);
		}
		dao.commitTransaction();
	}
	
}
