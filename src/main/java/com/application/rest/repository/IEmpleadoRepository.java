package com.application.rest.repository;

import com.application.rest.entities.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoRepository extends CrudRepository<Empleado,Long> {


}
