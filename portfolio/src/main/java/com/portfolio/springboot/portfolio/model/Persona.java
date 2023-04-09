/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.springboot.portfolio.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "es-AR", timezone = "America/Argentina/Buenos_Aires")
    private Date fechaNac;
    private String telefono;
    private String correo;
    private String sobreMi;
    private String urlFoto;
    private String estadoCivil;
    private String lenguajes;
    private String nacionalidad;
    private String celular;
    private String direccion;
    private String urlBanner;
    private String urlLinkedin;
    private String urlIg;
    private String urlGithub;
    
    public Persona()
    {
    }
    
    public Persona(Long newld, String newNombre, String newApellido)
    {
      this.id = newld;
      this.nombre = newNombre;
      this.apellido = newApellido;
    }
    
}
