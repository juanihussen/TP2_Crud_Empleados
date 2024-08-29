package com.application.rest.persistence;

import com.application.rest.entities.Empleado;

import java.util.List;
import java.util.Optional;

public interface IEmpleadoDAO {

    List<Empleado> findAllEmpleados();

    Optional<Empleado> findEmpleadoById(Long id);

    void altaEmpleado(Empleado empleado);

    void deleteEmpleado(Long id);

}
