package com.spring.ecommerce.controller;

import com.spring.ecommerce.model.Producto;
import com.spring.ecommerce.model.Usuario;
import com.spring.ecommerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/usuarios")
public class UsuarioController  {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/all")
    public List<Usuario> getAllUsuario(){
        return usuarioService.getAllUsuario();
    }
    @PostMapping("/save")
    public Usuario saveUsuario(@RequestBody Usuario usuario){
        return usuarioService.saveUsuario(usuario);
    }

    @GetMapping("/usuario/{id}")
    public Optional<Usuario> getUsuario(@PathVariable("id") Integer id){
        return usuarioService.getUsuario(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUsuario(@PathVariable("id") Integer id){
        usuarioService.deleteUsuario(id);
    }
    @PostMapping("/update")
    public void updateUsuario(Usuario usuario){
        usuarioService.updateUsuario(usuario);
    }
}
