/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.springboot.portfolio.service;

import com.portfolio.springboot.portfolio.model.Proyectos;
import com.portfolio.springboot.portfolio.repository.EducacionRepository;
import com.portfolio.springboot.portfolio.repository.ProyectosRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author krito
 */
@Service
public class ProyectosService implements IProyectosService {
    @Autowired
    public ProyectosRepository proyectosRepo;

    @Override
    public List<Proyectos> verProyectos() {
        return proyectosRepo.findAll();
    }

    @Override
    public Proyectos crearProyectos(Proyectos per) {
        return proyectosRepo.save(per);

    }

    @Override
    public Proyectos actualizarProyectos(Proyectos per) {
        return proyectosRepo.save(per);

    }

    @Override
    public void borrarProyectos(Long id) {
        proyectosRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyectos(Long id) {
        return proyectosRepo.findById(id).orElse(null);
    }

    @Override
    public List<Proyectos> buscarProyectosDe(Long id) {
        return proyectosRepo.findAll().stream().filter(e -> e.getPersona().getId().equals(id))
                .collect(Collectors.toUnmodifiableList());    }
    
}
