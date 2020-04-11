/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Tarjeta;
import com.example.demo.repository.Tarjeta_repository;
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
@RequestMapping("tarjeta")
public class Tarjeta_controller {
    
    @Autowired
      Tarjeta_repository tarjeta_repository;
    
    @GetMapping("")
	@CrossOrigin
	public List<Tarjeta> listar() {
		return this.tarjeta_repository.findAll();
		
	}

        @PostMapping("")
	@CrossOrigin
	public Tarjeta guardar(@RequestBody Tarjeta t) {
		return this.tarjeta_repository.save(t);
	}
    
        @GetMapping("/{idTarjeta}")
	@CrossOrigin
	public Tarjeta recuperar(@PathVariable Long idTarjeta) {
		return this.tarjeta_repository.findById(idTarjeta).get();
	}
	@DeleteMapping("/{idTarjeta}")
	@CrossOrigin
	public void eliminar(@PathVariable  Long idTarjeta) {
		this.tarjeta_repository.deleteById(idTarjeta);
	}
}
