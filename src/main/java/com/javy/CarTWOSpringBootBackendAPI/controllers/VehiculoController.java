/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javy.CarTWOSpringBootBackendAPI.controllers;

import com.javy.CarTWOSpringBootBackendAPI.entities.Vehiculo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javy.CarTWOSpringBootBackendAPI.services.VehiculosServiceImpl;

/**
 *
 * @author javy
 */
@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculosServiceImpl vehiculos;

    @GetMapping("/all")
    public List<Vehiculo> getVehiculos() {
        return (List<Vehiculo>) vehiculos.listar();
    }

    @GetMapping("/{id}")
    public Vehiculo getVehiculo(@PathVariable(value = "id") Integer id) {
        return vehiculos.getOne(id);
    }

    @PostMapping("/add")
    public Vehiculo addVehiculo(@RequestBody Vehiculo vehiculo) {

        vehiculos.agregar(vehiculo);

        return vehiculo;
    }

    @PutMapping("/edit/{id}")
    public String updateVehiculo(@PathVariable("id") Integer id, @RequestBody Vehiculo vehiculo) {
        vehiculo.setId(id);
        if (vehiculo != null) {
            vehiculos.editar(vehiculo);
            return "200 OK Vehiculo Modificado";
        }
        return "Vehiculo no encontrado";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteVehiculo(@PathVariable("id") Integer id) {
        Vehiculo vehiculo = vehiculos.getOne(id);
        if (vehiculo != null) {
            vehiculos.remover(id);
            return "200 OK Vehiculo Eliminado";
        }
        return "Vehiculo no encontrado";
    }
}
