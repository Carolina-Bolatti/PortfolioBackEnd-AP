/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.springboot.portfolio.service;

import com.portfolio.springboot.portfolio.model.TipoEmpleo;
import com.portfolio.springboot.portfolio.repository.TipoEmpleoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carolinabolatti
 */
@Service
public class TipoEmpleoService implements ITipoEmpleoService {
    @Autowired
    public TipoEmpleoRepository tipoEmpleoRepo;
 
    @Override
    public List<TipoEmpleo> verTipoEmpleo() {
        return tipoEmpleoRepo.findAll();
    }

    @Override
    public TipoEmpleo obtieneCrea(String nombre) {
        TipoEmpleo tipo = tipoEmpleoRepo.findByNombre(nombre);
        if (tipo == null) {
            tipo = new TipoEmpleo();
            tipo.setNombreTipo(nombre);
            return tipoEmpleoRepo.save(tipo);
        } else {
            return tipo;
        }
    }

    @Override
    public TipoEmpleo obtiene(String nombre) {
        return tipoEmpleoRepo.findByNombre(nombre);
    }
    
}
