package es.cursojava.hibernate.ejercicio1.service;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.hibernate.ejercicio1.dao.AlumnoDAO;
import es.cursojava.hibernate.ejercicio1.dto.AlumnoDTO;
import es.cursojava.hibernate.ejercicio1.entites.Alumno;

public class AlumnoService {
	
	
	public AlumnoService() {
		
	}
	
	public String consultarAulaPorNombreAlumnoService(String nombreAlumno) {
		if (nombreAlumno == null || nombreAlumno.isEmpty()) {
			throw new IllegalArgumentException("El nombre del alumno no puede ser nulo o vacío.");
		}
		
		AlumnoDAO alumnoDAO = new AlumnoDAO();
		
		//return alumnoDAO.obtenerAulaPorNombreAlumno(nombreAlumno).getCodigoAula();
		
		return alumnoDAO.obtenerCodigoAulaPorNombreAlumno(nombreAlumno);
	}
	
	public AlumnoDTO altaAlumnoService(AlumnoDTO alumnoDTO) {
		if (alumnoDTO == null) {
			throw new IllegalArgumentException("El objeto AlumnoDTO no puede ser nulo.");
		}
		if (alumnoDTO.getNombre() == null || alumnoDTO.getNombre().isEmpty()) {
			throw new IllegalArgumentException("El nombre del alumno no puede ser nulo o vacío.");
		}
		if (alumnoDTO.getEmail() == null || alumnoDTO.getEmail().isEmpty ()) {
			throw new IllegalArgumentException("El email del alumno no puede ser nulo o vacío.");
		}	
		if (alumnoDTO.getEdad() <= 0) {
			throw new IllegalArgumentException("La edad del alumno debe ser un número positivo.");
		}
		AlumnoDAO alumnoDAO = new AlumnoDAO();
		
		Alumno alumno = new Alumno(alumnoDTO.getNombre(), alumnoDTO.getEmail(), alumnoDTO.getEdad());
		
		alumnoDAO.guardarAlumno(alumno);
		
		return alumnoDTO;
	}
	
	
	public List<AlumnoDTO> obtenerTodosAlumnos() {
		AlumnoDAO alumnoDAO = new AlumnoDAO();
		List<Alumno> alumnos = alumnoDAO.obtenerTodosAlumnos();
		
		List<AlumnoDTO> alumnoDTOs = new ArrayList<>();
		for (Alumno alumno : alumnos) {
			AlumnoDTO alumnoDTO = new AlumnoDTO(alumno.getNombre(), alumno.getEmail(), alumno.getEdad());
			alumnoDTOs.add(alumnoDTO);
		}
		return alumnoDTOs;
	}

}
