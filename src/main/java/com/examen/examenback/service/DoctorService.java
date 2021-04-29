/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examenback.service;

import com.examen.examenback.entity.DoctorEntity;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author omarl
 */

@Service
public interface DoctorService {
    List<DoctorEntity> listar();
    DoctorEntity listarId(int idDoctor);
    DoctorEntity add(DoctorEntity doctor);
    DoctorEntity edit(DoctorEntity doctor);
    DoctorEntity delete(int idDoctor);
}
