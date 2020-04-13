/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;


import com.example.demo.modelo.ClienteDirecciones;
import com.example.demo.repository.ClienteDirecciones_repository;

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
@RequestMapping("clientedirecciones")
public class ClienteDirecciones_controller {
    @Autowired
	ClienteDirecciones_repository clientedireccion_repository;
	
	@GetMapping("")
	@CrossOrigin
	public List<ClienteDirecciones> listar() {
		return this.clientedireccion_repository.findAll();
		
	}
	
	@PostMapping("")
	@CrossOrigin
	public ClienteDirecciones guardar(@RequestBody ClienteDirecciones cd) {
		return this.clientedireccion_repository.save(cd);
	}
        @GetMapping("}")
	@CrossOrigin
	public ClienteDirecciones recuperar(@PathVariable Long idClienteDireccion) {
		return this.clientedireccion_repository.findById(idClienteDireccion).get();
	}
	@DeleteMapping("")
	@CrossOrigin
	public void eliminar(@PathVariable  Long idClienteDireccion) {
		 this.clientedireccion_repository.deleteById(idClienteDireccion);
	}
	
}