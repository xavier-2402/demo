/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;


import com.example.demo.modelo.Direccion;
import com.example.demo.repository.Direccion_repository;

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
@RequestMapping("direccion")
public class Direccion_controller {
       @Autowired
      Direccion_repository direccion_repository;
    
    @GetMapping("")
	@CrossOrigin
	public List<Direccion> listar() {
		return this.direccion_repository.findAll();
		
	}

        @PostMapping("")
	@CrossOrigin
	public Direccion guardar(@RequestBody Direccion d) {
		return this.direccion_repository.save(d);
	}
    
        @GetMapping("/{idDireccion}")
	@CrossOrigin
	public Direccion recuperar(@PathVariable Long idDireccion) {
		return this.direccion_repository.findById(idDireccion).get();
	}
	@DeleteMapping("/{idDireccion}")
	@CrossOrigin
	public void eliminar(@PathVariable  Long idDireccion) {
		this.direccion_repository.deleteById(idDireccion);
	}
}
