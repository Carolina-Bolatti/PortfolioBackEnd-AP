/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.springboot.portfolio.service;

import com.portfolio.springboot.portfolio.model.Educacion;
import com.portfolio.springboot.portfolio.model.Persona;
import java.util.List;

/**
 *
 * @author krito
 */
public interface IEducacionService {
    public List<Educacion> verEducacion();
    public Educacion crearEducacion(Educacion per);
    public Educacion actualizarEducacion(Educacion per);
    public void borrarEducacion(Long id);
    public Educacion buscarEducacion(Long id);
    public List<Educacion> buscarEducacionDe(Long id);
}
