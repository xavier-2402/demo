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

/**
 *
 * @author Jessica Alvarez
 */
@Entity
public class Vehiculo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idVehiculo;
    private String v_matricula;
    private String v_tipo;
    private String v_color;
    private String v_marca;
    private String v_anio;
    
    

     //vehiculo_conductor
     @JsonBackReference
     @JoinColumn(name="idConductor")
     @ManyToOne(fetch=FetchType.LAZY)
     private Conductor conductor;

    @JsonManagedReference
    @OneToMany(mappedBy = "vehiculo",cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Vehiculo>vehiculo = new ArrayList<>(); 
     
      @JsonBackReference
    @JoinColumn(name="idTarifa")
    @ManyToOne(fetch=FetchType.LAZY)
    private Tarifa  tarifa;
    
    
    public Long getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Long idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getV_matricula() {
        return v_matricula;
    }

    public void setV_matricula(String v_matricula) {
        this.v_matricula = v_matricula;
    }

    public String getV_tipo() {
        return v_tipo;
    }

    public void setV_tipo(String v_tipo) {
        this.v_tipo = v_tipo;
    }

    public String getV_color() {
        return v_color;
    }

    public void setV_color(String v_color) {
        this.v_color = v_color;
    }

    public String getV_marca() {
        return v_marca;
    }

    public void setV_marca(String v_marca) {
        this.v_marca = v_marca;
    }

    public String getV_anio() {
        return v_anio;
    }

    public void setV_anio(String v_anio) {
        this.v_anio = v_anio;
    }
  
}
