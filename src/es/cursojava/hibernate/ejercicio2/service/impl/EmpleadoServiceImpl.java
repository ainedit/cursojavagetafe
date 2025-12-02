package es.cursojava.hibernate.ejercicio2.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import es.cursojava.hibernate.ejercicio2.dao.EmpleadoDao;
import es.cursojava.hibernate.ejercicio2.dao.impl.EmpleadoDaoImpl;
import es.cursojava.hibernate.ejercicio2.dto.EmpleadoDto;
import es.cursojava.hibernate.ejercicio2.exception.BusinessException;
import es.cursojava.hibernate.ejercicio2.model.Empleado;
import es.cursojava.hibernate.ejercicio2.service.EmpleadoService;

public class EmpleadoServiceImpl implements EmpleadoService {

    private final EmpleadoDao empleadoDao;

    public EmpleadoServiceImpl() {
        // In a real app, this would be injected
        this.empleadoDao = new EmpleadoDaoImpl();
    }

    @Override
    public EmpleadoDto altaEmpleado(EmpleadoDto dto) {
        // Validations
        if (dto.getNif() == null || dto.getNif().trim().isEmpty()) {
            throw new BusinessException("El NIF es obligatorio.");
        }
        if (dto.getNombre() == null || dto.getNombre().trim().isEmpty()) {
            throw new BusinessException("El nombre es obligatorio.");
        }
        if (dto.getDepartamento() == null || dto.getDepartamento().trim().isEmpty()) {
            throw new BusinessException("El departamento es obligatorio.");
        }
        // Optional: Validate department against a list
        // if (!isValidDepartment(dto.getDepartamento())) throw ...

        if (dto.getSalario() == null || dto.getSalario().compareTo(BigDecimal.ZERO) < 0) {
            throw new BusinessException("El salario debe ser mayor o igual a 0.");
        }

        // Check unique NIF
        Empleado existing = empleadoDao.buscarPorNif(dto.getNif());
        if (existing != null) {
            throw new BusinessException("Ya existe un empleado con el NIF: " + dto.getNif());
        }

        // Convert DTO to Entity
        Empleado empleado = new Empleado();
        empleado.setNif(dto.getNif());
        empleado.setNombre(dto.getNombre());
        empleado.setDepartamento(dto.getDepartamento());
        empleado.setSalario(dto.getSalario());

        // Save
        empleadoDao.guardar(empleado);
        empleadoDao.commitTransaction();
        // Return DTO with ID
        dto.setId(empleado.getId());
        return dto;
    }

    @Override
    public EmpleadoDto actualizarSalario(String nif, BigDecimal nuevoSalario) {
        if (nif == null || nif.trim().isEmpty()) {
            throw new BusinessException("El NIF es obligatorio para actualizar salario.");
        }
        if (nuevoSalario == null || nuevoSalario.compareTo(BigDecimal.ZERO) < 0) {
            throw new BusinessException("El nuevo salario debe ser mayor o igual a 0.");
        }

        Empleado empleado = empleadoDao.buscarPorNif(nif);
        if (empleado == null) {
            throw new BusinessException("No se encontró empleado con NIF: " + nif);
        }

        empleado.setSalario(nuevoSalario);
        empleadoDao.guardar(empleado);
        empleadoDao.commitTransaction();
        
        return mapToDto(empleado);
    }

    @Override
    public EmpleadoDto buscarPorNif(String nif) {
        if (nif == null || nif.trim().isEmpty()) {
            throw new BusinessException("El NIF es obligatorio para buscar.");
        }
        Empleado empleado = empleadoDao.buscarPorNif(nif);
        if (empleado == null) {
            return null;
        }
        return mapToDto(empleado);
    }

    @Override
    public List<EmpleadoDto> listarPorDepartamento(String departamento) {
        if (departamento == null || departamento.trim().isEmpty()) {
            throw new BusinessException("El departamento es obligatorio para listar.");
        }
        List<Empleado> empleados = empleadoDao.buscarPorDepartamento(departamento);
        return mapToDtoList(empleados);
    }

    @Override
    public List<EmpleadoDto> listarTodos() {
        List<Empleado> empleados = empleadoDao.buscarTodos();
        return mapToDtoList(empleados);
    }

    private EmpleadoDto mapToDto(Empleado entity) {
        return new EmpleadoDto(
                entity.getId(),
                entity.getNif(),
                entity.getNombre(),
                entity.getDepartamento(),
                entity.getSalario());
    }

    private List<EmpleadoDto> mapToDtoList(List<Empleado> entities) {
        List<EmpleadoDto> dtos = new ArrayList<>();
        for (Empleado entity : entities) {
            dtos.add(mapToDto(entity));
        }
        return dtos;
    }
}
