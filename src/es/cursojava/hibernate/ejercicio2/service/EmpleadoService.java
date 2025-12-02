package es.cursojava.hibernate.ejercicio2.service;

import java.math.BigDecimal;
import java.util.List;

import es.cursojava.hibernate.ejercicio2.dto.EmpleadoDto;

public interface EmpleadoService {
    EmpleadoDto altaEmpleado(EmpleadoDto empleadoDto);

    EmpleadoDto actualizarSalario(String nif, BigDecimal nuevoSalario);

    EmpleadoDto buscarPorNif(String nif);

    List<EmpleadoDto> listarPorDepartamento(String departamento);

    List<EmpleadoDto> listarTodos();
}
