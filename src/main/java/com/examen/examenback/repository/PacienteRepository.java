/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examenback.repository;

import com.examen.examenback.entity.PacienteEntity;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author omarl
 */
public interface PacienteRepository extends Repository<PacienteEntity, Integer>{
    List<PacienteEntity> findAll();
    PacienteEntity findById(int idPaciente);
    PacienteEntity save(PacienteEntity paciente);
    void deleteById(int idPaciente);
}
