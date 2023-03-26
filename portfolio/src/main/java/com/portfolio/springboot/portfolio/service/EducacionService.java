/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.springboot.portfolio.service;

import com.portfolio.springboot.portfolio.model.Educacion;
import com.portfolio.springboot.portfolio.repository.EducacionRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author krito
 */
@Service
public class EducacionService implements IEducacionService {
    @Autowired
    public EducacionRepository eduRepo;

    @Override
    public List<Educacion> verEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion per) {
        eduRepo.save(per);
    }

    @Override
    public void actualizarEducacion(Educacion per) {
        eduRepo.save(per);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public List<Educacion> buscarEducacionDe(Long id) {
        return eduRepo.findAll().stream().filter(e -> e.getPersona().getId().equals(id))
                .collect(Collectors.toUnmodifiableList());    }
    
}
