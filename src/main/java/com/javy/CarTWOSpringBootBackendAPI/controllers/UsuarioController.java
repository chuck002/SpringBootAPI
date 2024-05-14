/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javy.CarTWOSpringBootBackendAPI.controllers;

import com.javy.CarTWOSpringBootBackendAPI.entities.Usuario;
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
import com.javy.CarTWOSpringBootBackendAPI.services.UsuariosServiceImpl;

/**
 *
 * @author javy
 */
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuariosServiceImpl usuarios;

    @GetMapping("/all")
    public List<Usuario> getUsers() {
        return (List<Usuario>) usuarios.listar();
    }

    @GetMapping("/{id}")
    public Usuario getUser(@PathVariable(value = "id") Integer id) {
        return usuarios.getOne(id);
    }

    @PostMapping("/add")
    public Usuario addUser(@RequestBody Usuario user) {
            usuarios.agregar(user);
            return user;

    }

    @PutMapping("/edit/{id}")
    public String updateUser(@PathVariable("id") Integer id, @RequestBody Usuario user) {

        user.setId(id);
        if (user != null) {
            usuarios.editar(user);
            return "200 OK Usuario Editado";
        }
        return "Usuario no encontrado";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id) {
        Usuario user = usuarios.getOne(id);
        if (user != null) {
            usuarios.remover(id);
            return "200 OK Usuario Eliminado";
        }
        return "Usuario no encontrado";
    }
}
