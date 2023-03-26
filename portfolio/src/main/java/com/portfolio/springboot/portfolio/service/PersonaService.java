/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.springboot.portfolio.service;

import com.portfolio.springboot.portfolio.model.Persona;
import com.portfolio.springboot.portfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author krito
 */
@Service
public class PersonaService implements IPersonaService{
    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> verPersona() {
        return persoRepo.findAll();
    }
        
    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }
    
    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }
    
    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public void actualizarPersona(Persona per) {
        persoRepo.save(per);
    }
    
}
