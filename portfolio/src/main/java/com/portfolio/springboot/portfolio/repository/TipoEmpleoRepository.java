/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.springboot.portfolio.repository;

import com.portfolio.springboot.portfolio.model.TipoEmpleo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author carolinabolatti
 */
public interface TipoEmpleoRepository extends JpaRepository <TipoEmpleo,Long> {
    @Query("SELECT t FROM TipoEmpleo t WHERE t.nombreTipo = ?1")
    TipoEmpleo findByNombre(String nombre);

}
