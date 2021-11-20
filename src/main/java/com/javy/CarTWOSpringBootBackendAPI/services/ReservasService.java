/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javy.CarTWOSpringBootBackendAPI.services;

import com.javy.CarTWOSpringBootBackendAPI.entities.Reserva;
import java.util.List;

/**
 *
 * @author javy
 */
public interface ReservasService {
    
    public List<Reserva> listar();
    public Reserva getOne(int id);
    public void agregar(Reserva reserva);
    public void editar(Reserva reserva);
    public void remover(int id);
    
}
