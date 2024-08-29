package com.application.rest.persistence.impl;

import com.application.rest.entities.Empleado;
import com.application.rest.persistence.IEmpleadoDAO;
import com.application.rest.repository.IEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

@Component
public class EmpleadoDAOimpl implements IEmpleadoDAO {


    @Autowired
    private IEmpleadoRepository empleadoRepository;


    @Override
    public List<Empleado> findAllEmpleados() {
        return (List<Empleado>) empleadoRepository.findAll();
    }

    @Override
    public Optional<Empleado> findEmpleadoById(Long id) {
        return empleadoRepository.findById();
    }

    @Override
    public void altaEmpleado(Empleado empleado) {

    }

    @Override
    public void deleteEmpleado(Long id) {

    }
}
