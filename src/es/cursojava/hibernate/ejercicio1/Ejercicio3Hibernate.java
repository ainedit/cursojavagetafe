package es.cursojava.hibernate.ejercicio1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import es.cursojava.hibernate.ejercicio1.dao.AulaDAO;
import es.cursojava.hibernate.ejercicio1.dao.CursoDAO;
import es.cursojava.hibernate.ejercicio1.dao.CursoDAOImpl;
import es.cursojava.hibernate.ejercicio1.dto.AulaDTO;
import es.cursojava.hibernate.ejercicio1.dto.CursoDTOReq;
import es.cursojava.hibernate.ejercicio1.dto.CursoDTOResp;
import es.cursojava.hibernate.ejercicio1.service.CursoService;
import es.cursojava.utils.HibernateUtil;

public class Ejercicio3Hibernate {

    public static void main(String[] args) {

        CursoDAO cursoDAO = new CursoDAOImpl();
        AulaDAO aulaDAO = new AulaDAO();
        CursoService cursoService = new CursoService();

        try {
            // 1. Crear un CursoDTO
            CursoDTOReq cursoDTO = new CursoDTOReq(
					"CURSO-JAVA-01",
					"Java Avanzado con Hibernate",
					"Aprende conceptos avanzados de Java y Hibernate",
					Integer.valueOf(40),
					Boolean.valueOf(true),
					"Avanzado",
					"Programación",
					new BigDecimal(29.99),
					LocalDate.now(),
					LocalDate.now().plusMonths(1),
					LocalDateTime.now()
			);
            
            
            // 2. Crear un AulaDTO
            AulaDTO aulaDTO = new AulaDTO(
                    "A-101",
                    30,
                    "Edificio Principal, Planta 1"
            );

            // 3. Crear curso con aula
            CursoDTOResp guardado = cursoService.crearCursoConAula(cursoDTO, aulaDTO);

            System.out.println("Curso guardado con ID: " + guardado.getId());
            System.out.println("Aula del curso: " +
                    (guardado.getAula() != null ? guardado.getAula().getCodigoAula() : "Sin aula"));

            // 4. Recuperar el curso de BD
            CursoDTOResp recuperado = cursoService.buscarPorId(guardado.getId());
            System.out.println("Curso recuperado: " + recuperado.getNombre());
            System.out.println("Aula asociada: " + recuperado.getAula().getCodigoAula());

        } finally {
            System.out.println("Finalizando aplicación y cerrando sesión Hibernate.");
        }
    }
}
