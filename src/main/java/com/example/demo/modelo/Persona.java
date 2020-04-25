/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modelo;

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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Jessica Alvarez
 */
@Entity
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idPersona;
    private String cedula;
    private String nombre;
    private String correo;
    private String contrasenia;
    
    private String apellido;
    private String telefono;
    
   
    @OneToOne(mappedBy = "persona",cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Cliente cliente;

   
     
    @OneToOne(mappedBy = "persona",cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Conductor conductor ;

      //conductor-direccion
    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="idDirecciones")
    private Direccion direccion;
        
    

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    
    
    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

          
}
