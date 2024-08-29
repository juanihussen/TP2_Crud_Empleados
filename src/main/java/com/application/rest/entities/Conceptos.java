package com.application.rest.entities;


import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "conceptos")
public class Conceptos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private int hsMinimo;

    private int hsMaximo;

    private boolean laborable;




}
