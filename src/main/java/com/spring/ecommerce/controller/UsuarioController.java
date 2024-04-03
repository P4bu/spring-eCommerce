package com.spring.ecommerce.controller;

import com.spring.ecommerce.model.Producto;
import com.spring.ecommerce.model.Usuario;
import com.spring.ecommerce.service.UsuarioService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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
    @PatchMapping("/update/{id}")
    public void updateUsuario(@PathVariable("id") Integer id, @RequestBody Usuario usuario, Model model){
        Usuario usuario1 = new Usuario();
        Optional<Usuario> optionalUsuario = usuarioService.getUsuario(id);
        usuario1 = optionalUsuario.get();
        model.addAttribute("usuario1", usuario1);
        usuarioService.saveUsuario(usuario);
    }
}
