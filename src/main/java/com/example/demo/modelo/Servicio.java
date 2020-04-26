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
import java.util.Date;
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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Jessica Alvarez
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter()
@Setter()
public class Servicio implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idServicio;
    private Date fecha_servicio;
    
    //servicio-vehiculo
    @JsonBackReference
     @JoinColumn(name="idVehiculo")
      @ManyToOne(fetch=FetchType.LAZY)
     private Vehiculo vehiculo;
    
     @JsonBackReference
     @JoinColumn(name="idCliente")
      @ManyToOne(fetch=FetchType.LAZY)
     private Cliente cliente;
      
     
     @JsonManagedReference
    @OneToMany(mappedBy = "servicio",cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Ubicacion> ubicacion = new ArrayList<>();

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
    
   
}
