package com.application.rest.entities;

import jakarta.persistence.*;
import lombok.*;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;


@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long nroDocumento;

    private String nombre;

    private String apelido;

    private String email;

    private String fechaNacimiento;

    private String fechaIngreso;

    private String fechaCreacion;

    @OneToOne(mappedBy = "empleado", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Conceptos concepto = new Conceptos();

}
