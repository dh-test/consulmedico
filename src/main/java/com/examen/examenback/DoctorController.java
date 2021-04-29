/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examenback;

import com.examen.examenback.entity.DoctorEntity;
import com.examen.examenback.service.DoctorService;
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
@RequestMapping({"/doctores"})
public class DoctorController {
    @Autowired
    DoctorService doctorService;
    
    @GetMapping
    public List<DoctorEntity> listar(){
        return doctorService.listar();
    }
    
    @PostMapping
    public DoctorEntity agregar(@RequestBody DoctorEntity doctor){
        return doctorService.add(doctor);
    }
    
    @GetMapping(path = {"/{id}"})
    public DoctorEntity listarId(@PathVariable("id") int idDoctor){
        return doctorService.listarId(idDoctor);
    }
    
    @PutMapping(path = {"/{id}"})
    public DoctorEntity editar(@RequestBody DoctorEntity doctor, @PathVariable("id") int idDoctor){
        doctor.setIdDoctor(idDoctor);
        return doctorService.edit(doctor);
    }
}
