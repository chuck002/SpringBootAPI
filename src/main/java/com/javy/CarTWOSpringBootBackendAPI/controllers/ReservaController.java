/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javy.CarTWOSpringBootBackendAPI.controllers;

import com.javy.CarTWOSpringBootBackendAPI.entities.Reserva;
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
import com.javy.CarTWOSpringBootBackendAPI.services.ReservasServiceImpl;
import javax.transaction.Transactional;

/**
 *
 * @author javy
 */

@RestController
@RequestMapping("/reservas")
public class ReservaController {
    
    @Autowired
    private ReservasServiceImpl reservas;
    
    @GetMapping("/all")
    public List<Reserva> getReservas(){
        return (List<Reserva>)reservas.listar();
    }
    
    @GetMapping("/{id}")
    public Reserva getReserva(@PathVariable(value = "id") Integer id){
        return reservas.getOne(id);
    }
    
    @PostMapping("/add")
    @Transactional
    public Reserva addReserva(@RequestBody Reserva reserva){    
            reservas.agregar(reserva);
            return reserva;
    }
    
    @PutMapping("/edit/{id}")
    public String updateReserva(@PathVariable("id") Integer id, @RequestBody Reserva reserva){
        
        reserva.setId(id);
        if (reserva != null) {
            reservas.editar(reserva);
            return "200 OK Reserva Editada";
        }
        return "Reserva no encontrada";
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteReserva(@PathVariable("id") Integer id){
        
        Reserva reserva = reservas.getOne(id);
        if (reserva != null) {
            reservas.remover(id);
            return "200 OK Reserva Eliminada";
        }
        return "Reserva no encontrada";
    }
    
}
