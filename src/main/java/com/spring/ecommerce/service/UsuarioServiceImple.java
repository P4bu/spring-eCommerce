package com.spring.ecommerce.service;

import com.spring.ecommerce.model.Usuario;
import com.spring.ecommerce.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsuarioServiceImple implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> getAllUsuario() {
        List<Usuario> allUsuario = usuarioRepository.findAll();
        return allUsuario;
    }

    @Override
    public Optional<Usuario> getUsuario(Integer id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void deleteUsuario(Integer id) {
        usuarioRepository.deleteById(id);
    }
}
