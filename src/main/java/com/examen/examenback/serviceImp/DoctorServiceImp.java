/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examenback.serviceImp;

import com.examen.examenback.entity.DoctorEntity;
import com.examen.examenback.repository.DoctorRepository;
import com.examen.examenback.service.DoctorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author omarl
 */

@Service
public class DoctorServiceImp implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;
    
    @Override
    public List<DoctorEntity> listar() {
        return doctorRepository.findAll();
    }

    @Override
    public DoctorEntity listarId(int idDoctor) {
        return doctorRepository.findById(idDoctor);
    }

    @Override
    public DoctorEntity add(DoctorEntity doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public DoctorEntity edit(DoctorEntity doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public DoctorEntity delete(int idDoctor) {
        doctorRepository.deleteById(idDoctor);
        return null;
    }
    
}
