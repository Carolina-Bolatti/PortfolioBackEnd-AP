/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.springboot.portfolio.service;

import com.portfolio.springboot.portfolio.model.Educacion;
import com.portfolio.springboot.portfolio.model.Proyectos;
import java.util.List;

/**
 *
 * @author krito
 */
public interface IProyectosService {
    public List<Proyectos> verProyectos();
    public Proyectos crearProyectos(Proyectos per);
    public Proyectos actualizarProyectos(Proyectos per);
    public void borrarProyectos(Long id);
    public Proyectos buscarProyectos(Long id);
    public List<Proyectos> buscarProyectosDe(Long id);
}
