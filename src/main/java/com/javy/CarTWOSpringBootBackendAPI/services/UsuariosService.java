/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javy.CarTWOSpringBootBackendAPI.services;

import com.javy.CarTWOSpringBootBackendAPI.entities.Usuario;
import java.util.List;

/**
 *
 * @author javy
 */
public interface UsuariosService {
    public List<Usuario> listar();
    public Usuario getOne(int id);
    public void agregar(Usuario user);
    public void editar(Usuario user);
    public void remover(int id);
}
