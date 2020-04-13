/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;


import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.Vehiculo_repository;
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
@RequestMapping("vehiculo")
public class Vehiculo_controller {
    @Autowired
      Vehiculo_repository vehiculo_repository;
    
    @GetMapping("")
	@CrossOrigin
	public List<Vehiculo> listar() {
		return this.vehiculo_repository.findAll();
		
	}

        @PostMapping("")
	@CrossOrigin
	public Vehiculo guardar(@RequestBody Vehiculo v) {
		return this.vehiculo_repository.save(v);
	}
    
        @GetMapping("/{idVehiculo}")
	@CrossOrigin
	public Vehiculo recuperar(@PathVariable Long idVehiculo) {
		return this.vehiculo_repository.findById(idVehiculo).get();
	}
	@DeleteMapping("/{idVehiculo}")
	@CrossOrigin
	public void eliminar(@PathVariable  Long idVehiculo) {
		this.vehiculo_repository.deleteById(idVehiculo);
	}
}
