/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.modelo.Servicio;
import com.example.demo.modelo.Ubicacion;
import com.example.demo.repository.Servicio_repository;
import com.example.demo.repository.Ubicacion_repository;
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
@RequestMapping("ubicacion")
public class Ubicacion_cotroller {
    
    @Autowired
      Ubicacion_repository ubicacion_repository;
    
    @GetMapping("")
	@CrossOrigin
	public List<Ubicacion> listar() {
		return this.ubicacion_repository.findAll();
		
	}

        @PostMapping("")
	@CrossOrigin
	public Ubicacion guardar(@RequestBody Ubicacion c) {
		return this.ubicacion_repository.save(c);
	}
    
        @GetMapping("/{idUbicacion}")
	@CrossOrigin
	public Ubicacion recuperar(@PathVariable Long idUbicacion) {
		return this.ubicacion_repository.findById(idUbicacion).get();
	}
	@DeleteMapping("/{idUbicacion}")
	@CrossOrigin
	public void eliminar(@PathVariable  Long idUbicacion) {
		this.ubicacion_repository.deleteById(idUbicacion);
	}
    
}
