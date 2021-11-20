/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javy.CarTWOSpringBootBackendAPI.services;

import com.javy.CarTWOSpringBootBackendAPI.entities.Reserva;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javy.CarTWOSpringBootBackendAPI.repositories.ReservasDAO;

/**
 *
 * @author javy
 */

@Service
public class ReservasServiceImpl implements ReservasService {
    
    @Autowired
    private ReservasDAO reservas;

    @Override
    public List<Reserva> listar() {
        return reservas.findAll();
    }

    @Override
    public Reserva getOne(int id) {
        return reservas.findById(id).get();
    }

    @Override
    public void agregar(Reserva reserva) {
        reservas.save(reserva);
    }

    @Override
    public void editar(Reserva reserva) {
       reservas.save(reserva);
    }

    @Override
    public void remover(int id) {
       reservas.deleteById(id);
    }

    
}
