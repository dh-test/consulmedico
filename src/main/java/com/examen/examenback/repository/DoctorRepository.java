/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examenback.repository;

import com.examen.examenback.entity.DoctorEntity;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author omarl
 */
public interface DoctorRepository extends Repository<DoctorEntity, Integer>{
    List<DoctorEntity> findAll();
    DoctorEntity findById(int idDoctor);
    DoctorEntity save(DoctorEntity doctor);
    void deleteById(int idDoctor);
}
