package com.spring.ecommerce.service;

import com.spring.ecommerce.model.Producto;
import com.spring.ecommerce.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    public Usuario saveUsuario(Usuario usuario);
    public List<Usuario> getAllUsuario();
    public Optional<Usuario> getUsuario(Integer id);
    public void updateUsuario(Usuario usuario);
    public void deleteUsuario(Integer id);
}
