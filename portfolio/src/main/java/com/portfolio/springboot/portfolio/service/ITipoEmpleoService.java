/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.springboot.portfolio.service;

import com.portfolio.springboot.portfolio.model.TipoEmpleo;
import java.util.List;

/**
 *
 * @author carolinabolatti
 */
public interface ITipoEmpleoService {
    public List<TipoEmpleo> verTipoEmpleo();  
    public TipoEmpleo obtiene(String nombre);
    public TipoEmpleo obtieneCrea(String nombre);
}
