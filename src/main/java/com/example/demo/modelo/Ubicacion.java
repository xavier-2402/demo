/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Jessica Alvarez
 */
@Entity
public class Ubicacion implements Serializable{
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUbicacion;
    private String u_latitud;
    private String u_longitud;
    
    @JsonBackReference
    @JoinColumn(name="idServicio")
    @ManyToOne(fetch=FetchType.LAZY)
    private Servicio servicio;
    
    
    
}
