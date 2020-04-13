/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;


import com.example.demo.modelo.Servicio;
import com.example.demo.repository.Servicio_repository;
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
@RequestMapping("servicio")
public class Servicio_controller {
    @Autowired
      Servicio_repository servicio_repository;
    
    @GetMapping("")
	@CrossOrigin
	public List<Servicio> listar() {
		return this.servicio_repository.findAll();
		
	}

        @PostMapping("")
	@CrossOrigin
	public Servicio guardar(@RequestBody Servicio c) {
		return this.servicio_repository.save(c);
	}
    
        @GetMapping("/{idServicio}")
	@CrossOrigin
	public Servicio recuperar(@PathVariable Long idServicio) {
		return this.servicio_repository.findById(idServicio).get();
	}
	@DeleteMapping("/{idServicio}")
	@CrossOrigin
	public void eliminar(@PathVariable  Long idServicio) {
		this.servicio_repository.deleteById(idServicio);
	}
    
}
