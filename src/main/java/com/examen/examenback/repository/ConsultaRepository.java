/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examenback.repository;

import com.examen.examenback.entity.ConsultasEntity;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author omarl
 */
public interface ConsultaRepository extends Repository<ConsultasEntity, Integer>{
    List<ConsultasEntity> findAll();
    ConsultasEntity findById(int idConsulta);
//    List<ConsultasEntity> findAllById(int idPaciente);
    ConsultasEntity save(ConsultasEntity consulta);
    void deleteById(int idConsulta);
}
