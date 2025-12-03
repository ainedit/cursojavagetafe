package es.cursojava.hibernate.ejercicio2;

import java.math.BigDecimal;
import java.util.List;

import es.cursojava.hibernate.ejercicio2.dto.EmpleadoDto;
import es.cursojava.hibernate.ejercicio2.exception.BusinessException;
import es.cursojava.hibernate.ejercicio2.service.EmpleadoService;
import es.cursojava.hibernate.ejercicio2.service.impl.EmpleadoServiceImpl;

public class AppEmpleados {

    public static void main(String[] args) {
        System.out.println("=== INICIO DE LA APLICACIÓN DE GESTIÓN DE EMPLEADOS ===");

        EmpleadoService servicio = new EmpleadoServiceImpl();

//        // 1. Alta de empleados
        System.out.println("\n--- 1. ALTA DE EMPLEADOS ---");
        //crearEmpleado(servicio, "11111111A", "Juan Perez", "IT", new BigDecimal("2500.00"));
//        crearEmpleado(servicio, "22222222B", "Maria Lopez", "RRHH", new BigDecimal("2000.00"));
//        crearEmpleado(servicio, "33333333C", "Carlos Ruiz", "IT", new BigDecimal("2800.00"));

//        // Intento de duplicado
//        System.out.println(">> Intentando crear empleado con NIF duplicado...");
//        crearEmpleado(servicio, "11111111A", "Juan Duplicado", "VENTAS", new BigDecimal("1500.00"));

//        // Intento de datos inválidos
//	      System.out.println(">> Intentando crear empleado con salario negativo...");
//	      crearEmpleado(servicio, "44444444D", "Ana Error", "VENTAS", new BigDecimal("-100.00"));
//
//        // 2. Listado por departamento
//        System.out.println("\n--- 2. LISTADO POR DEPARTAMENTO (IT) ---");
//        List<EmpleadoDto> itEmployees = servicio.listarPorDepartamento("IT");
//        for (EmpleadoDto emp : itEmployees) {
//            System.out.println(emp);
//        }
//
//        // 3. Búsqueda por NIF
//        System.out.println("\n--- 3. BÚSQUEDA POR NIF (22222222B) ---");
//        EmpleadoDto encontrado = servicio.buscarPorNif("22222222B");
//        System.out.println("Encontrado: " + encontrado);
//
//        // 4. Actualización de salario
//        System.out.println("\n--- 4. ACTUALIZACIÓN DE SALARIO ---");
//        try {
//            System.out.println("Actualizando salario de 11111111A a 3000.00...");
//            EmpleadoDto actualizado = servicio.actualizarSalario("11111111A", new BigDecimal("3000.00"));
//            System.out.println("Empleado actualizado: " + actualizado);
//        } catch (BusinessException e) {
//            System.err.println("Error al actualizar salario: " + e.getMessage());
//        }
//
//        // Verificación final
        System.out.println("\n--- LISTADO FINAL DE TODOS LOS EMPLEADOS ---");
        List<EmpleadoDto> todos = servicio.listarTodos();
        for (EmpleadoDto emp : todos) {
            System.out.println(emp);
        }
//
        System.out.println("\n=== FIN DE LA APLICACIÓN ===");

        // Force exit to close Hibernate pools if needed, though in simple main it's
        // fine.
        System.exit(0);
    }

    private static void crearEmpleado(EmpleadoService servicio, String nif, String nombre, String dept,
            BigDecimal salario) {
        try {
            EmpleadoDto nuevoEmpleado = new EmpleadoDto(nif, nombre, dept, salario);
            servicio.altaEmpleado(nuevoEmpleado);
            System.out.println("Empleado creado: " + nuevoEmpleado);
        } catch (BusinessException e) {
            System.err.println("Error de Negocio: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        }
    }
}
