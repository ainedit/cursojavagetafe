package es.cursojava.hibernate.ejercicioonetomany;

import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import es.cursojava.hibernate.ejercicio1.dto.AlumnoDTO;
import es.cursojava.hibernate.ejercicio1.dto.AulaDTO;
import es.cursojava.hibernate.ejercicio1.dto.CursoDTOReq;
import es.cursojava.hibernate.ejercicio1.service.AlumnoService;
import es.cursojava.hibernate.ejercicio1.service.CursoService;
import es.cursojava.utils.Utilidades;
import es.cursojava.utils.UtilidadesFicheros;

public class EscuelaMain {
	private List<String> lineasAulas;
	private List<String> lineasCursos;
	private List<String> lineasAlumnos;
	
	public static void main(String[] args) {
		EscuelaMain main = new EscuelaMain();
		try { 
			//main.inicializar();
			main.mostrarAulaAlumno();
			System.exit(0);
		} catch (Exception e) { 
			System.exit(1); 
		}
		
	}
	
	private void mostrarAulaAlumno() {
		String nombre = Utilidades.pideDatoCadena("Introduce el nombre del alumno: ");
		AlumnoService alumnoService = new AlumnoService();
		String codigoAula = alumnoService.consultarAulaPorNombreAlumnoService(nombre);
		System.out.println("El alumno " + nombre + " pertenece al aula con código: " + codigoAula);
		
		
	}
	
	
	private void inicializar() {
		cargarFicheros();
		generarDTOs();
	}
	
	private void generarDTOs() {
		Map<String, AulaDTO> mapaAulas  = generarAulasDTO();
		Map<String, CursoDTOReq> mapaCursos =  generarCursosDTO();
		Map<Integer, List<AlumnoDTO>> mapaAlumnos = generarAlumnosDTO();
		
		CursoService cursoService = new CursoService();
		cursoService.altaCursosConAulasYAlumnos(mapaAulas, mapaCursos, mapaAlumnos);
		
	}
	
	private void cargarFicheros() {
		String rutaFicheroAulas = "ficheros/aulas.txt";
		String rutaFicheroCursos = "ficheros/cursos_aula.txt";
		String rutaFicheroAlumnos = "ficheros/alumnos_curso.txt";
		try {
			this.lineasAulas = UtilidadesFicheros.leerFichero(rutaFicheroAulas);
			this.lineasCursos = UtilidadesFicheros.leerFichero(rutaFicheroCursos);
			this.lineasAlumnos = UtilidadesFicheros.leerFichero(rutaFicheroAlumnos);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private Map<String, AulaDTO> generarAulasDTO() {
		this.lineasAulas.remove(0); // eliminar cabecera
		Map<String, AulaDTO> mapaAulasDTO = new java.util.HashMap<>();
		
		for (String linea : this.lineasAulas) {
			System.out.println(linea);
			//String[] datos =  linea.split(UtilidadesFicheros.SEPARADOR_SEMI_COLON);
			
			StringTokenizer tokenAula = new StringTokenizer(linea, UtilidadesFicheros.SEPARADOR_SEMI_COLON);
			while (tokenAula.hasMoreTokens()) {
				String codigoAula = tokenAula.nextToken();
				int capacidadAula = Integer.parseInt(tokenAula.nextToken());
				String ubicacionAula = tokenAula.nextToken();
				
				AulaDTO aulaDTO = new AulaDTO(codigoAula, capacidadAula, ubicacionAula);
				
				mapaAulasDTO.put(codigoAula, aulaDTO);
			}
		}
		return mapaAulasDTO;
	}
	
	private Map<String, CursoDTOReq> generarCursosDTO() {
		this.lineasCursos.remove(0); // eliminar cabecera
		Map<String, CursoDTOReq> mapaCursosDTO = new java.util.HashMap<>();
		
		for (String linea : this.lineasCursos) {
			String[] datos =  linea.split(UtilidadesFicheros.SEPARADOR_SEMI_COLON);
			String codigoCurso = datos[0];
			String nombreCurso = datos[1];
			String descripcionCurso = datos[2];
			int duracionHorasCurso = Integer.parseInt(datos[3]);
			boolean activoCurso = Boolean.parseBoolean(datos[4]);
			String nivelCurso = datos[5];
			String areaCurso = datos[6];
			java.math.BigDecimal precioCurso = new java.math.BigDecimal(datos[7]);
			java.time.LocalDate fechaInicioCurso = java.time.LocalDate.parse(datos[8]);
			java.time.LocalDate fechaFinCurso = java.time.LocalDate.parse(datos[9]);
			
			CursoDTOReq cursoDTO = new CursoDTOReq(codigoCurso, nombreCurso, descripcionCurso, duracionHorasCurso, activoCurso, 
					nivelCurso, areaCurso, precioCurso, 
					fechaInicioCurso, fechaFinCurso,
					java.time.LocalDateTime.now(), datos[11]);
			
			mapaCursosDTO.put(codigoCurso, cursoDTO);
		}
		return mapaCursosDTO;
	}
	
	private Map<Integer, List<AlumnoDTO>> generarAlumnosDTO() {
		this.lineasAlumnos.remove(0); // eliminar cabecera
		Map<Integer, List<AlumnoDTO>> mapaAlumnosDTO = new java.util.HashMap<>();
		
		for (String linea : this.lineasAlumnos) {
			System.out.println(linea);
			String[] datos =  linea.split(UtilidadesFicheros.SEPARADOR_SEMI_COLON);
			String nombreAlumno = datos[0];
			String emailAlumno = datos[1];
			int edadAlumno = Integer.parseInt(datos[2]);
			int codigoCursoAlumno = Integer.parseInt(datos[3]);
			
			AlumnoDTO alumnoDTO = new AlumnoDTO(nombreAlumno, emailAlumno, edadAlumno, codigoCursoAlumno);
			
			if(mapaAlumnosDTO.containsKey(codigoCursoAlumno)) {
				mapaAlumnosDTO.get(codigoCursoAlumno).add(alumnoDTO);
			} else {
				List<AlumnoDTO> listaAlumnos = new java.util.ArrayList<>();
				listaAlumnos.add(alumnoDTO);
				mapaAlumnosDTO.put(codigoCursoAlumno, listaAlumnos);
			}	
		}
		return mapaAlumnosDTO;
	}
	
	
}
