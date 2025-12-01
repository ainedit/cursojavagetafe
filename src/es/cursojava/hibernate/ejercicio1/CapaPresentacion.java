package es.cursojava.hibernate.ejercicio1;

import java.util.List;

import es.cursojava.hibernate.ejercicio1.dto.CursoDTOReq;
import es.cursojava.hibernate.ejercicio1.dto.CursoDTOResp;
import es.cursojava.hibernate.ejercicio1.service.CursoService;

public class CapaPresentacion {

	public static void main(String[] args) {
		pintarCursosActivos();
	}
	
	public static void insertarCursos() {
		CursoService cursoService = new CursoService();
		CursoDTOReq cursoDTO = new CursoDTOReq("CURSO001", "Java Básico", "Introducción a Java", 40, true, "Básico", "Programación", 
				new java.math.BigDecimal("199.99"), java.time.LocalDate.of(2025, 1, 15), java.time.LocalDate.of(2025, 2, 15),
				java.time.LocalDateTime.now());
		cursoService.altaCurso(cursoDTO);
		
		
	}
	
	public static void pintarCursosActivos() {
		CursoService cursoService = new CursoService();
		List<CursoDTOResp> cursosActivos =  cursoService.listarCursosActivos();
		
		
		for (CursoDTOResp cursoDTOResp : cursosActivos) {
			System.out.println("Curso activo: ID="+cursoDTOResp.getId()+", Nombre="+cursoDTOResp.getNombre());
			if (cursoDTOResp.getMensaje() != null) {
				System.out.println("  Mensaje: "+cursoDTOResp.getMensaje());
			}
		}
		
	}
}
