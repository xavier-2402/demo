/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Jessica Alvarez
 */
@Entity
public class Cliente implements Serializable{
    
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCliente;
     
    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="idPersona")
    private Persona persona;
 
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idTarjeta", nullable = false)
    private Tarjeta tarjeta;
    
   

@JsonManagedReference
    @OneToMany(mappedBy = "cliente",cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Servicio>servicio = new ArrayList<>();

              
    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

   
    

   
    
     
    
    
}
