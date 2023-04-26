/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.springboot.portfolio.service;

import com.portfolio.springboot.portfolio.model.Educacion;
import com.portfolio.springboot.portfolio.model.ExperienciaLaboral;
import com.portfolio.springboot.portfolio.model.Persona;
import java.util.List;

/**
 *
 * @author krito
 */
public interface IExperienciaLaboralService {
    public List<ExperienciaLaboral> verExperienciaLaboral();
    public ExperienciaLaboral crearExperienciaLaboral(ExperienciaLaboral per);
    public ExperienciaLaboral actualizarExperienciaLaboral(ExperienciaLaboral per);
    public void borrarExperienciaLaboral(Long id);
    public ExperienciaLaboral buscarExperienciaLaboral(Long id);
    public List<ExperienciaLaboral> buscarExperienciaLaboralDe(Long id);
}
