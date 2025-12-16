package es.cursojava.hibernate.ejercicio1.service;

import es.cursojava.hibernate.ejercicio1.dao.AlumnoDAO;

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

}
