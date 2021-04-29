/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examenback;

import com.examen.examenback.entity.ConsultasEntity;
import com.examen.examenback.service.ConsultaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author omarl
 */

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/consultas"})
public class ConsultasController {
    @Autowired
    ConsultaService consultaService;
    
    @GetMapping
    public List<ConsultasEntity> listar(){
        return consultaService.listar();
    }
    
    @PostMapping
    public ConsultasEntity agregar(@RequestBody ConsultasEntity consulta){
        return consultaService.add(consulta);
    }
    
    @GetMapping(path = {"/{id}"})
    public ConsultasEntity listarId(@PathVariable("id") int idConsulta){
        return consultaService.listarId(idConsulta);
    }
    
    @PutMapping(path = {"/{id}"})
    public ConsultasEntity editar(@RequestBody ConsultasEntity consulta, @PathVariable("id") int idConsulta){
        consulta.setIdConsulta(idConsulta);
        return consultaService.edit(consulta);
    }
}
