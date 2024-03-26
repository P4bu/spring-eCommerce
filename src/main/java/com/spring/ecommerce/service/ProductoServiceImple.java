package com.spring.ecommerce.service;

import com.spring.ecommerce.model.Producto;
import com.spring.ecommerce.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
@Service
public class ProductoServiceImple  implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;
    @Override
    public Producto save( Producto producto) {
        return productoRepository.save(producto);
    }
    @Override
    public List<Producto> getAll() {
        List<Producto> all = productoRepository.findAll();
        return all;
    }
    @Override
    public Optional<Producto> getProducto(Integer id) {
        return productoRepository.findById(id);
    }

    @Override
    public void update(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public void delete(Integer id) {
        productoRepository.deleteById(id);
    }

}
