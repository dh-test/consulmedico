/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examenback.serviceImp;

import com.examen.examenback.entity.PacienteEntity;
import com.examen.examenback.service.PacienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examen.examenback.repository.PacienteRepository;

/**
 *
 * @author omarl
 */

@Service
public class PacienteServiceImp implements PacienteService{
    @Autowired
    private PacienteRepository pacienteRepository;
    
    @Override
    public List<PacienteEntity> listar() {
        return pacienteRepository.findAll();
    }

    @Override
    public PacienteEntity listarId(int idPaciente) {
        return pacienteRepository.findById(idPaciente);
    }

    @Override
    public PacienteEntity add(PacienteEntity paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public PacienteEntity edit(PacienteEntity paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public PacienteEntity delete(int idPaciente) {
        pacienteRepository.deleteById(idPaciente);
        return null;
    }
    
}
