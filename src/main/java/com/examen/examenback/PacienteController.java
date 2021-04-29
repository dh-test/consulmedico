/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examenback;

import com.examen.examenback.entity.PacienteEntity;
import com.examen.examenback.service.PacienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author omarl
 */

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/pacientes"})
public class PacienteController {
    @Autowired
    PacienteService pacienteService;
    
    @GetMapping
    public List<PacienteEntity> listar(){
        return pacienteService.listar();
    }
    
    @PostMapping
    public PacienteEntity agregar(@RequestBody PacienteEntity paciente){
        return pacienteService.add(paciente);
    }
    
    @GetMapping(path = {"/{id}"})
    public PacienteEntity listarId(@PathVariable("id") int idPaciente){
        return pacienteService.listarId(idPaciente);
    }
    
    @PutMapping(path = {"/{id}"})
    public PacienteEntity editar(@RequestBody PacienteEntity paciente, @PathVariable("id") int idPaciente){
        paciente.setIdPaciente(idPaciente);
        return pacienteService.edit(paciente);
    }
}
