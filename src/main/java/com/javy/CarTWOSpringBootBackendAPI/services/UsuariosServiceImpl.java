/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javy.CarTWOSpringBootBackendAPI.services;

import com.javy.CarTWOSpringBootBackendAPI.entities.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javy.CarTWOSpringBootBackendAPI.repositories.UsuariosDAO;

/**
 *
 * @author javy
 */
@Service
public class UsuariosServiceImpl implements UsuariosService {
    
    @Autowired
    private UsuariosDAO usuarios;

    @Override
    public List<Usuario> listar() {
return usuarios.findAll();
    }

    @Override
    public Usuario getOne(int id) {
        return usuarios.findById(id).get();
    }

    @Override
    public void agregar(Usuario user) {
       usuarios.save(user);
    }

    @Override
    public void editar(Usuario user) {
          usuarios.save(user);
    }

    @Override
    public void remover(int id) {
        usuarios.deleteById(id);
    }

    
}
