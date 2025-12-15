package es.cursojava.hibernate.ejercicio1.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import es.cursojava.hibernate.ejercicio1.dao.AulaDAO;
import es.cursojava.hibernate.ejercicio1.dao.CursoDAOImpl;
import es.cursojava.hibernate.ejercicio1.dto.AlumnoDTO;
import es.cursojava.hibernate.ejercicio1.dto.AulaDTO;
import es.cursojava.hibernate.ejercicio1.dto.CursoDTOReq;
import es.cursojava.hibernate.ejercicio1.dto.CursoDTOResp;
import es.cursojava.hibernate.ejercicio1.entites.Alumno;
import es.cursojava.hibernate.ejercicio1.entites.Aula;
import es.cursojava.hibernate.ejercicio1.entites.Curso;

public class CursoService {
	
	public void altaCursosConAulasYAlumnos(Map<String, AulaDTO> mapaAulas
			,Map<String, CursoDTOReq> mapaCursos
			,Map<Integer, List<AlumnoDTO>> mapaAlumnos) {
		
		CursoDAOImpl cursoDAO = new CursoDAOImpl();
		Collection<CursoDTOReq> cursos = mapaCursos.values();
		for (CursoDTOReq cursoDTOReq : cursos) {
			//Validacion de cursoDTO
			Curso curso = mapToEntity(cursoDTOReq);
			//Asignar Aula
			AulaDTO aulaDTO = mapaAulas.get(cursoDTOReq.getCodigoAula());
			Aula aula = mapToEntity(aulaDTO);
			curso.setAula(aula);
			
			//Asignar Alumnos
			List<AlumnoDTO> listadoAlumnosDTO = mapaAlumnos.get(Integer.parseInt(cursoDTOReq.getCodigo()));
			List<Alumno> listadoAlumnos = new ArrayList<>();
			for (AlumnoDTO alumnoDTO : listadoAlumnosDTO) {
				Alumno alumno = mapToEntity(alumnoDTO);
				alumno.setCurso(curso); // Asignar el curso al alumno
				listadoAlumnos.add(alumno);
			}
			curso.setAlumnos(listadoAlumnos);
			
			
			cursoDAO.guardarCurso(curso);

		}
		
		cursoDAO.commitTransaction();
		
	}
	
	
	
	public void altaCurso(CursoDTOReq cursoDTO) {
		// Validar curso
		if (cursoDTO.getCodigo() == null || cursoDTO.getCodigo().isEmpty() || cursoDTO.getCodigo().length() > 20) {
			throw new IllegalArgumentException(
					"El código del curso es obligatorio, no puede estar vacío y debe tener un máximo de 20 caracteres.");
		}
		// Insertar curso
		CursoDAOImpl cursoDAO = new CursoDAOImpl();

		Curso curso = new Curso(cursoDTO.getCodigo(), cursoDTO.getNombre(), cursoDTO.getDescripcion(),
				cursoDTO.getHorasTotales(), cursoDTO.getActivo(), cursoDTO.getNivel(), cursoDTO.getCategoria(),
				cursoDTO.getPrecio(), cursoDTO.getFechaInicio(), cursoDTO.getFechaFin());

		cursoDAO.guardarCurso(curso);
		cursoDAO.commitTransaction();
		// cursoDAO.guardarCursoDTO(cursoDTO);

	}

	public CursoDTOResp crearCursoConAula(CursoDTOReq cursoDTO, AulaDTO aulaDTO) {
		CursoDAOImpl cursoDAO = new CursoDAOImpl();
		validarAula(aulaDTO);

		Curso curso = mapToEntity(cursoDTO);
		Aula aula = mapToEntity(aulaDTO);

		curso.setAula(aula); // Cascade.ALL se encarga de persistir el aula

		cursoDAO.guardarCurso(curso);
		cursoDAO.commitTransaction();
		
		return mapToDTO(curso);
	}

	public void asignarAula(Long cursoId, Long aulaId) {
		AulaDAO aulaDAO = new AulaDAO();
		CursoDAOImpl cursoDAOImpl = new CursoDAOImpl();
		Aula aula = aulaDAO.findById(aulaId);
		if (aula == null) {
			throw new IllegalArgumentException("No existe aula con id=" + aulaId);
		}

		// Validar que esa aula no esté ya asociada a otro curso
		if (cursoDAOImpl.existsCursoWithAula(aulaId)) {
			throw new IllegalStateException("El aula con id=" + aulaId + " ya está asignada a otro curso.");
		}

		cursoDAOImpl.asignarAula(cursoId, aula);
	}

	public CursoDTOResp buscarPorId(Long id) {
		CursoDAOImpl cursoDAOImpl = new CursoDAOImpl();
        Curso curso = cursoDAOImpl.findById(id);
        System.out.println("Curso encontrado: " + (curso != null ? curso.getNombre() : "null"));
        if (curso == null) {
            return null;
        }
        return mapToDTO(curso);
    }
	
	// ---------- Validaciones ----------

	private void validarAula(AulaDTO aulaDTO) {
		if (aulaDTO.getCapacidad() == null || aulaDTO.getCapacidad() <= 0) {
			throw new IllegalArgumentException("La capacidad del aula debe ser mayor que 0");
		}
		if (aulaDTO.getCodigoAula() == null || aulaDTO.getCodigoAula().isBlank()) {
			throw new IllegalArgumentException("El código del aula no puede estar vacío");
		}
	}

	public List<CursoDTOResp> listarCursosActivos() {
		CursoDAOImpl cursoDAO = new CursoDAOImpl();
		List<Curso> cursos = cursoDAO.obtenerCursosActivos();
		List<CursoDTOResp> cursosDTO = new ArrayList();

		for (Curso curso : cursos) {
			cursosDTO.add(new CursoDTOResp(curso.getId(), curso.getNombre(), null));
		}

		cursoDAO.commitTransaction();

		return cursosDTO;
	}

	// ---------- Mapeos Entity <-> DTO ----------

	private Curso mapToEntity(CursoDTOReq dto) {
		if (dto == null)
			return null;
		Curso curso = new Curso(dto.getCodigo(), dto.getNombre(), dto.getDescripcion(), dto.getHorasTotales(),
				dto.getActivo(), dto.getNivel(), dto.getCategoria(), dto.getPrecio(), dto.getFechaInicio(),
				dto.getFechaFin());

		// id no se setea porque lo genera la BBDD
		return curso;
	}

	private Aula mapToEntity(AulaDTO dto) {
		if (dto == null)
			return null;
		return new Aula(dto.getCodigoAula(), dto.getCapacidad(), dto.getUbicacion());
	}

	
	private Alumno mapToEntity(AlumnoDTO dto) {
		if (dto == null)
			return null;
		return new Alumno(dto.getNombre(), dto.getEmail(), dto.getEdad());
	}
	
	private CursoDTOResp mapToDTO(Curso entity) {
		if (entity == null)
			return null;

		System.out.println("Mapeando curso: " + entity.getNombre());
		AulaDTO aulaDTO = null;
		if (entity.getAula() != null) {
			Aula aula = entity.getAula();
			aulaDTO = new AulaDTO(aula.getId(), aula.getCodigoAula(), aula.getCapacidad(), aula.getUbicacion());
		}
		
		System.out.println("Mapeando curso2: ");

		return new CursoDTOResp(entity.getId(), entity.getCodigo(), entity.getNombre(), entity.getDescripcion(),
				entity.getHorasTotales(), null,aulaDTO);
	}

}
