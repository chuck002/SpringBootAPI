/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javy.CarTWOSpringBootBackendAPI.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author javy
 */

@Entity
@Data
@Table(name="Reservas", schema = "")
public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;
    @Column(nullable = false)
    private Date fecha_inicio;
    @Column(nullable = false)
    private Date fecha_final;
    @Column(nullable = false)
    private double precio_total;
    @Column(nullable = false)
    private int id_oficina;
    @Column(nullable = false)
    private int id_cliente;
    @Column(nullable = false)
    @ManyToMany(cascade = CascadeType.MERGE)
    private List<Vehiculo> vehiculos_reservados;

    
}
