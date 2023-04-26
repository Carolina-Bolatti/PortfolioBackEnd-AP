/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.springboot.portfolio.service;

import com.portfolio.springboot.portfolio.model.Educacion;
import com.portfolio.springboot.portfolio.model.Proyectos;
import com.portfolio.springboot.portfolio.model.Skills;
import java.util.List;

/**
 *
 * @author krito
 */
public interface ISkillsService {
    public List<Skills> verSkills();
    public Skills crearSkills(Skills per);
    public Skills actualizarSkills(Skills per);
    public void borrarSkills(Long id);
    public Skills buscarSkills(Long id);
    public List<Skills> buscarSkillsDe(Long id);
}
