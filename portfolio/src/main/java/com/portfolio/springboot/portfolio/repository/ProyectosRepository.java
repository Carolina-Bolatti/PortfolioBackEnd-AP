/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.springboot.portfolio.repository;

import com.portfolio.springboot.portfolio.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author krito
 */
public interface ProyectosRepository extends JpaRepository <Proyectos,Long> {
    
}
