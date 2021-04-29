/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examenback.serviceImp;

import com.examen.examenback.entity.ConsultasEntity;
import com.examen.examenback.repository.ConsultaRepository;
import com.examen.examenback.service.ConsultaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author omarl
 */

@Service
public class ConsultaServiceImp implements ConsultaService {
    
    @Autowired
    private ConsultaRepository consultaRepository;
    
    @Override
    public List<ConsultasEntity> listar() {
        return consultaRepository.findAll();
    }

    @Override
    public ConsultasEntity listarId(int idConsulta) {
        return consultaRepository.findById(idConsulta);
    }

    @Override
    public ConsultasEntity add(ConsultasEntity consulta) {
        return consultaRepository.save(consulta);
    }

    @Override
    public ConsultasEntity edit(ConsultasEntity consulta) {
        return consultaRepository.save(consulta);
    }

    @Override
    public ConsultasEntity delete(int idConsulta) {
        consultaRepository.deleteById(idConsulta);
        return null;
    }
    
}
