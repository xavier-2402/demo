/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.modelo.Cliente;
import com.example.demo.repository.Cliente_repository;
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
@RequestMapping("cliente")
public class Cliente_controller {
    @Autowired
      Cliente_repository cliente_repository;
    
    @GetMapping("")
	@CrossOrigin
	public List<Cliente> listar() {
		return this.cliente_repository.findAll();
		
	}

        @PostMapping("")
	@CrossOrigin
	public Cliente guardar(@RequestBody Cliente c) {
		return this.cliente_repository.save(c);
	}
    
        @GetMapping("/{idCliente}")
	@CrossOrigin
	public Cliente recuperar(@PathVariable Long idCliente) {
		return this.cliente_repository.findById(idCliente).get();
	}
	@DeleteMapping("/{idCliente}")
	@CrossOrigin
	public void eliminar(@PathVariable  Long idCliente) {
		this.cliente_repository.deleteById(idCliente);
	}
}
