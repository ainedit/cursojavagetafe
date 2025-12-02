package es.cursojava.hibernate.ejercicio2.dao;

import java.util.List;

import es.cursojava.hibernate.ejercicio2.model.Empleado;

public interface EmpleadoDao extends GenericDao {
    void guardar(Empleado empleado);

    Empleado buscarPorId(Long id);

    Empleado buscarPorNif(String nif);

    List<Empleado> buscarPorDepartamento(String departamento);

    List<Empleado> buscarTodos();
}
