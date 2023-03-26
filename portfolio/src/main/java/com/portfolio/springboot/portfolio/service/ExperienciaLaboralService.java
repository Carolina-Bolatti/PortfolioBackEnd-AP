/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.springboot.portfolio.service;

import com.portfolio.springboot.portfolio.model.ExperienciaLaboral;
import com.portfolio.springboot.portfolio.repository.ExperienciaLaboralRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author krito
 */
@Service
public class ExperienciaLaboralService implements IExperienciaLaboralService {
    @Autowired
    public ExperienciaLaboralRepository expLabRepo;

    @Override
    public List<ExperienciaLaboral> verExperienciaLaboral() {
        return expLabRepo.findAll();
    }

    @Override
    public void crearExperienciaLaboral(ExperienciaLaboral per) {
        expLabRepo.save(per);
    }

    @Override
    public void actualizarExperienciaLaboral(ExperienciaLaboral per) {
        expLabRepo.save(per);
    }

    @Override
    public void borrarExperienciaLaboral(Long id) {
        expLabRepo.deleteById(id);
    }

    @Override
    public ExperienciaLaboral buscarExperienciaLaboral(Long id) {
        return expLabRepo.findById(id).orElse(null);
    }

    @Override
    public List<ExperienciaLaboral> buscarExperienciaLaboralDe(Long id) {
        return expLabRepo.findAll().stream().filter(e -> e.getPersona().getId().equals(id))
                .collect(Collectors.toUnmodifiableList());    }
    
}
