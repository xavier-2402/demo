/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
import javax.persistence.OneToOne;

/**
 *
 * @author Jessica Alvarez
 */
@Entity
public class ClienteDirecciones {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idClienteDireccion;
     private String direction_paritda;
     private String direccion_llegada;
     
      @JsonBackReference
     @JoinColumn(name="idCliente")
      @ManyToOne(fetch=FetchType.LAZY)
     private Cliente cliente;
      
      //clientedirecciones-direccion
     // @JsonBackReference
     //@JoinColumn(name="idDirecciones")
      //@ManyToOne(fetch=FetchType.LAZY)
     //private Direccion direccion;
      
      //servicio-clientedirecciones
      
    //@OneToOne(mappedBy = "clientedirecciones", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    //private Servicio servicio;

    public Long getIdClienteDireccion() {
        return idClienteDireccion;
    }

    public void setIdClienteDireccion(Long idClienteDireccion) {
        this.idClienteDireccion = idClienteDireccion;
    }

    public String getDirection_paritda() {
        return direction_paritda;
    }

    public void setDirection_paritda(String direction_paritda) {
        this.direction_paritda = direction_paritda;
    }

    public String getDireccion_llegada() {
        return direccion_llegada;
    }

    public void setDireccion_llegada(String direccion_llegada) {
        this.direccion_llegada = direccion_llegada;
    }

}
