/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.springboot.portfolio.repository;

import com.portfolio.springboot.portfolio.model.Educacion;
import com.portfolio.springboot.portfolio.model.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author krito
 */
public interface ExperienciaLaboralRepository extends JpaRepository <ExperienciaLaboral,Long> {
    
}
