package es.cursojava.hibernate.ejercicio1;

import java.time.LocalDate;
import java.util.List;

import es.cursojava.hibernate.ejercicio1.dao.CursoDAOImpl;
import es.cursojava.hibernate.ejercicio1.entites.Curso;

public class Ejercicio2Hibernate {

	public static void main(String[] args) {
		//filtrarPorFechas();
		//filtrarPorCategoriaYFecha();
		//filtrarPorNivelYHorasYFechaInicio();
		filtrarCampos();
	}
	
	public static void filtrarCampos() {
		CursoDAOImpl dao = new CursoDAOImpl();
		List<Curso> cursos = dao.obtenerNombreDescripcionCursos2();
		for (Curso curso : cursos) {
			System.out.println("Curso encontrado: "+curso.getNombre()+" - "+curso.getDescripcion());
		}
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
        for (Curso curso : cursos) {
			System.out.println("Curso encontrado: "+curso.getCodigo()+" - "+curso.getNombre());
		}        
    }
	
	
	public static void filtrarPorCategoriaYFecha() {

		CursoDAOImpl dao = new CursoDAOImpl();

        // Definir el rango de fechas
        LocalDate fechaDesde = LocalDate.of(2025, 2, 1);
        String categoria = "Backend";

        // Llamar al método
        List<Curso> cursos = dao.obtenerCursosPorCategoriaYFechaInicio(categoria, fechaDesde);

        // Mostrar resultados
        System.out.println("Cursos de la categoría " + categoria + " con fecha de inicio a partir de " + fechaDesde + ":");	
        for (Curso curso : cursos) {
			System.out.println("Curso encontrado: "+curso.getCodigo()+" - "+curso.getNombre());
		}        
    }
	
	
	public static void filtrarPorNivelYHorasYFechaInicio() {

		CursoDAOImpl dao = new CursoDAOImpl();

        // Definir el rango de fechas
        LocalDate fechaDesde = LocalDate.of(2025, 1, 1);
        String nivel = "Básico";
        int numHoras = 30;
        
        List<Curso> cursos = dao.obtenerCursosPorNivelYHorasYFechaInicio(nivel, numHoras, fechaDesde);

        // Mostrar resultados
        System.out.println("Cursos de nivel " + nivel + " con número de horas " + numHoras + " y fecha de inicio a partir de " + fechaDesde + ":");	
        for (Curso curso : cursos) {
			System.out.println("Curso encontrado: "+curso.getCodigo()+" - "+curso.getNombre());
		}        
    }
	
}
