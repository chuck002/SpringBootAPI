/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javy.CarTWOSpringBootBackendAPI.repositories;

import com.javy.CarTWOSpringBootBackendAPI.entities.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



/**
 *
 * @author javy
 */
@Repository
public interface ReservasDAO extends JpaRepository<Reserva, Integer> {

}
