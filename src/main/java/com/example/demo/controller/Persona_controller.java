/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;


import com.example.demo.modelo.Persona;
import com.example.demo.repository.Persona_repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jessica Alvarez
 */
@RestController
@RequestMapping("persona")
public class Persona_controller {
    @Autowired
     Persona_repository persona_repository;
    
    @GetMapping("")
	@CrossOrigin
	public List<Persona> listar() {
		return this.persona_repository.findAll();
		
	}

        @PostMapping("")
	@CrossOrigin
	public Persona guardar(@RequestBody Persona p) {
		return this.persona_repository.save(p);
	}
    
        @GetMapping("/{idPersona}")
	@CrossOrigin
	public Persona recuperar(@PathVariable Long idPersona) {
		return this.persona_repository.findById(idPersona).get();
	}
	@DeleteMapping("/{idPersona}")
	@CrossOrigin
	public void eliminar(@PathVariable  Long idPersona) {
		this.persona_repository.deleteById(idPersona);
	}
}
