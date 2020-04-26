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
public class Direccion  implements Serializable
{
       @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idDireccion;
       
        private String provincia_dir;
        private String canton_dir;
        private String parroquia_dir;
        private String barrio_dir;
        private String calle_dir;
        
       
       
}
