/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examenback.service;

import com.examen.examenback.entity.ConsultasEntity;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author omarl
 */

@Service
public interface ConsultaService {
    List<ConsultasEntity> listar();
    ConsultasEntity listarId(int idConsulta);
    ConsultasEntity add(ConsultasEntity consulta);
    ConsultasEntity edit(ConsultasEntity consulta);
    ConsultasEntity delete(int idConsulta);
}
