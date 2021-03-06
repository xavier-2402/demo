/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class Tarifa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTarifa;
    private double valor;
    private String tarifa_descripcion;
    
    @OneToMany(mappedBy = "tarifa", cascade = CascadeType.ALL)
    private List<Vehiculo> vehiculo= new ArrayList();
    

    public Long getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(Long idTarifa) {
        this.idTarifa = idTarifa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTarifa_descripcion() {
        return tarifa_descripcion;
    }

    public void setTarifa_descripcion(String tarifa_descripcion) {
        this.tarifa_descripcion = tarifa_descripcion;
    }
    
    
    
    
    
}
