/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.modelo.Tarifa;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.Tarifa_repository;
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
@RequestMapping("tarifa")
public class Tarifa_controller {
     @Autowired
      Tarifa_repository tarifa_repository;
    
    @GetMapping("")
	@CrossOrigin
	public List<Tarifa> listar() {
		return this.tarifa_repository.findAll();
		
	}

        @PostMapping("")
	@CrossOrigin
	public Tarifa guardar(@RequestBody Tarifa v) {
		return this.tarifa_repository.save(v);
	}
    
        @GetMapping("/{idTarifa}")
	@CrossOrigin
	public Tarifa recuperar(@PathVariable Long idTarifa) {
		return this.tarifa_repository.findById(idTarifa).get();
	}
	@DeleteMapping("/{idTarifa}")
	@CrossOrigin
	public void eliminar(@PathVariable  Long idTarifa) {
		this.tarifa_repository.deleteById(idTarifa);
	}
    
}
