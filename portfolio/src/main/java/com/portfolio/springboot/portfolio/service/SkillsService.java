/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.springboot.portfolio.service;

import com.portfolio.springboot.portfolio.model.Skills;
import com.portfolio.springboot.portfolio.repository.ProyectosRepository;
import com.portfolio.springboot.portfolio.repository.SkillsRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author krito
 */
@Service
public class SkillsService implements ISkillsService {
    @Autowired
    public SkillsRepository skillsRepo;

    @Override
    public List<Skills> verSkills() {
        return skillsRepo.findAll();
    }

    @Override
    public Skills crearSkills(Skills per) {
        return skillsRepo.save(per);
    }

    @Override
    public Skills actualizarSkills(Skills per) {
        return skillsRepo.save(per);
    }

    @Override
    public void borrarSkills(Long id) {
        skillsRepo.deleteById(id);
    }

    @Override
    public Skills buscarSkills(Long id) {
        return skillsRepo.findById(id).orElse(null);
    }

    @Override
    public List<Skills> buscarSkillsDe(Long id) {
        return skillsRepo.findAll().stream().filter(e -> e.getPersona().getId().equals(id))
                .collect(Collectors.toUnmodifiableList());
    }
    
}
