/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javy.CarTWOSpringBootBackendAPI.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author javy
 */

@Entity
@Data
@Table(name="Vehiculos", schema = "")
public class Vehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int Id;
    private double precio_alquiler;
    private double litros_combustible;
    private int entregado;
    private String patente;
    private String modelo;
    private String marca;
    private String color;
}
