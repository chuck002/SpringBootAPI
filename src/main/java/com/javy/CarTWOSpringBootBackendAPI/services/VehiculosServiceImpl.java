/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javy.CarTWOSpringBootBackendAPI.services;

import com.javy.CarTWOSpringBootBackendAPI.entities.Vehiculo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javy.CarTWOSpringBootBackendAPI.repositories.VehiculosDAO;

/**
 *
 * @author javy
 */
@Service
public class VehiculosServiceImpl implements VehiculosService {
    
    @Autowired
    private VehiculosDAO vehiculos;

    @Override
    public List<Vehiculo> listar() {
        return vehiculos.findAll();
    }

    @Override
    public Vehiculo getOne(int id) {
        return vehiculos.findById(id).get();
    }

    @Override
    public void agregar(Vehiculo vehiculo) {
        vehiculos.save(vehiculo);
    }

    @Override
    public void editar(Vehiculo vehiculo) {
        vehiculos.save(vehiculo);
    }

    @Override
    public void remover(int id) {
        vehiculos.deleteById(id);
    }

    
}
