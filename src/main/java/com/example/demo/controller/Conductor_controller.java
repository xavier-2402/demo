/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.modelo.Conductor;
import com.example.demo.repository.Conductor_repository;
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
@RequestMapping("conductor")
public class Conductor_controller {
    @Autowired
	Conductor_repository conductor_repository;
	
	@GetMapping("")
	@CrossOrigin
	public List<Conductor> listar() {
		return this.conductor_repository.findAll();
		
	}
	
	@PostMapping("")
	@CrossOrigin
	public Conductor guardar(@RequestBody Conductor c) {
		return this.conductor_repository.save(c);
	}

          @GetMapping("/{idConductor}")
	@CrossOrigin
	public Conductor recuperar(@PathVariable Long idConductor) {
		return this.conductor_repository.findById(idConductor).get();
	}
	@DeleteMapping("/{idConductor}")
	@CrossOrigin
	public void eliminar(@PathVariable  Long idConductor) {
		this.conductor_repository.deleteById(idConductor);
	}


}
