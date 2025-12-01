package es.cursojava.hibernate.ejercicio1.service;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.hibernate.ejercicio1.dao.CursoDAOImpl;
import es.cursojava.hibernate.ejercicio1.dto.CursoDTOReq;
import es.cursojava.hibernate.ejercicio1.dto.CursoDTOResp;
import es.cursojava.hibernate.ejercicio1.entites.Curso;

public class CursoService {

	
	public void altaCurso(CursoDTOReq cursoDTO) {
		//Validar curso
		if (cursoDTO.getCodigo() == null || cursoDTO.getCodigo().isEmpty() 
				|| cursoDTO.getCodigo().length()>20) {
			throw new IllegalArgumentException("El código del curso es obligatorio, no puede estar vacío y debe tener un máximo de 20 caracteres.");
		}
		//Insertar curso
		CursoDAOImpl cursoDAO = new CursoDAOImpl();
		
		Curso curso = new Curso(cursoDTO.getCodigo(), cursoDTO.getNombre(), cursoDTO.getDescripcion(),
				cursoDTO.getHorasTotales(), cursoDTO.getActivo(), cursoDTO.getNivel(),
				cursoDTO.getCategoria(), cursoDTO.getPrecio(), cursoDTO.getFechaInicio(),
				cursoDTO.getFechaFin());
		
		cursoDAO.guardarCurso(curso);
		cursoDAO.commitTransaction();
		//cursoDAO.guardarCursoDTO(cursoDTO);
		
		
	}
	
	public List<CursoDTOResp> listarCursosActivos() {
		CursoDAOImpl cursoDAO = new CursoDAOImpl();
		List<Curso> cursos = cursoDAO.obtenerCursosActivos();
		List<CursoDTOResp> cursosDTO = new ArrayList();
		
		for (Curso curso : cursos) {
				cursosDTO.add(new CursoDTOResp(curso.getId(),curso.getNombre(), null));
		}
		
		cursoDAO.commitTransaction();
		
		return cursosDTO;
	}
	
	
}
