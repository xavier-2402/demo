/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.Date;
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
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idServicio;
    private Date fecha_servicio;
    
    //servicio-vehiculo
    @JsonBackReference
     @JoinColumn(name="idVehiculo")
      @ManyToOne(fetch=FetchType.LAZY)
     private Vehiculo vehiculo;
    
//    servicio-cliente_direcciones
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "idClienteDireccion", nullable = false)
//    private ClienteDirecciones cliente_direcciones;
//    
//   

    public Long getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Long idServicio) {
        this.idServicio = idServicio;
    }

    public Date getFecha_servicio() {
        return fecha_servicio;
    }

    public void setFecha_servicio(Date fecha_servicio) {
        this.fecha_servicio = fecha_servicio;
    }
    
    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="idClienteDireccion")
    private ClienteDirecciones clientedireccion;
}
