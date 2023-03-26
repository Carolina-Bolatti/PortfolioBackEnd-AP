/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.springboot.portfolio.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author krito
 */
@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tituloAlcanzado;
    private String descripcion;
    private String lugar;
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    private Boolean estaCursando;
    private String urlFoto;
    @ManyToOne
    @JoinColumn(name="persona_id", nullable=false)
    private Persona persona;
}