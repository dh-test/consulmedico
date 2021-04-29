/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examenback.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author omarl
 */

@Entity
@Table(name = "medicamentos")
public class MedicamentosEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMedicamento;
    @Column
    private int idConsulta;
    @Column
    private String descripcion;
    @Column
    private String cantidad;
    @Column
    private String dosis;
}
