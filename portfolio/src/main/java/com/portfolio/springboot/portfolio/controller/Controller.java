/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.springboot.portfolio.controller;

import com.portfolio.springboot.portfolio.model.Educacion;
import com.portfolio.springboot.portfolio.model.ExperienciaLaboral;
import com.portfolio.springboot.portfolio.model.Persona;
import com.portfolio.springboot.portfolio.model.Proyectos;
import com.portfolio.springboot.portfolio.model.Skills;
import com.portfolio.springboot.portfolio.service.IEducacionService;
import com.portfolio.springboot.portfolio.service.IExperienciaLaboralService;
import com.portfolio.springboot.portfolio.service.IPersonaService;
import com.portfolio.springboot.portfolio.service.IProyectosService;
import com.portfolio.springboot.portfolio.service.ISkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author krito
 */
@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class Controller {
    @Autowired
    private IPersonaService persoServ;
    @Autowired
    private IEducacionService eduServ;
    @Autowired
    private IExperienciaLaboralService expLabServ;
    @Autowired
    private IProyectosService proyServ;
    @Autowired
    private ISkillsService skillsServ;
    @GetMapping("/hola/{nombre}")
    public String decirHola(@PathVariable String nombre){
        return "hola "+nombre;
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersona() {
        return persoServ.verPersona();
    }

    @GetMapping("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion() {
        return eduServ.verEducacion();
    }
    
    @GetMapping("/ver/experiencia")
    @ResponseBody
    public List<ExperienciaLaboral> verExperiencia() {
        return expLabServ.verExperienciaLaboral();
    }
    
    @GetMapping("/ver/proyectos")
    @ResponseBody
    public List<Proyectos> verProyectos() {
        return proyServ.verProyectos();
    }
    
    @GetMapping("/ver/skills")
    @ResponseBody
    public List<Skills> verSkills() {
        return skillsServ.verSkills();
    }
    
    @GetMapping("/ver/persona/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable Long id) {
        return persoServ.buscarPersona(id);
    }
    
    @DeleteMapping("/delete/persona/de/{id}")
    public void deletePersona(@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }
    
    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona persona) {
        persoServ.crearPersona(persona);
    }
    
    @PutMapping("/update/persona")
    public void actualizarPersona(@RequestBody Persona persona) {
        persoServ.actualizarPersona(persona);
    }
    
    @GetMapping("/ver/educacion/de/{id}")
    @ResponseBody
    public List<Educacion> verEducacionDe(@PathVariable Long id) {
        return eduServ.buscarEducacionDe(id);
    }
    
    @DeleteMapping("/delete/educacion/de/{id}")
    public void deleteEducacionDe(@PathVariable Long id) {
        eduServ.borrarEducacion(id);
    }

    @PostMapping("/new/educacion")
    public void agregarEducacion(@RequestBody Educacion educacion) {
        eduServ.crearEducacion(educacion);
    }

    @PutMapping("/update/educacion")
    public void actualizarEducacion(@RequestBody Educacion educacion) {
        eduServ.actualizarEducacion(educacion);
    }

    @GetMapping("/ver/experiencia/de/{id}")
    @ResponseBody
    public List<ExperienciaLaboral> verExperienciaDe(@PathVariable Long id) {
        return expLabServ.buscarExperienciaLaboralDe(id);
    }
    
    @DeleteMapping("/delete/experiencia/de/{id}")
    public void deleteExperienciaDe(@PathVariable Long id) {
        expLabServ.borrarExperienciaLaboral(id);
    }

    @PostMapping("/new/experiencia")
    public void agregarExperiencia(@RequestBody ExperienciaLaboral experiencia) {
        expLabServ.crearExperienciaLaboral(experiencia);
    }

    @PutMapping("/update/experiencia")
    public void actualizarExperiencia(@RequestBody ExperienciaLaboral experiencia) {
        expLabServ.actualizarExperienciaLaboral(experiencia);
    }

    @GetMapping("/ver/proyectos/de/{id}")
    @ResponseBody
    public List<Proyectos> verProyectosDe(@PathVariable Long id) {
        return proyServ.buscarProyectosDe(id);
    }
    
    @DeleteMapping("/delete/proyectos/de/{id}")
    public void deleteProyectosDe(@PathVariable Long id) {
        proyServ.borrarProyectos(id);
    }

    @PostMapping("/new/proyectos")
    public void agregarProyectos(@RequestBody Proyectos proyecto) {
        proyServ.crearProyectos(proyecto);
    }

    @PutMapping("/update/proyectos")
    public void actualizarProyectos(@RequestBody Proyectos proyecto) {
        proyServ.actualizarProyectos(proyecto);
    }

    @GetMapping("/ver/skills/de/{id}")
    @ResponseBody
    public List<Skills> verSkillsDe(@PathVariable Long id) {
        return skillsServ.buscarSkillsDe(id);
    }

    @DeleteMapping("/delete/skills/de/{id}")
    public void deleteSkillsDe(@PathVariable Long id) {
        proyServ.borrarProyectos(id);
    }

    @PostMapping("/new/skills")
    public void agregarSkills(@RequestBody Skills skill) {
        skillsServ.crearSkills(skill);
    }

    @PutMapping("/update/skills")
    public void actiualizarSkills(@RequestBody Skills skill) {
        skillsServ.actualizarSkills(skill);
    }

}
