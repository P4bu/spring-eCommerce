package com.spring.ecommerce.service;

import com.spring.ecommerce.model.Producto;

import java.util.List;
import java.util.Optional;


public interface ProductoService {
    public Producto save(Producto producto);
    public List<Producto> getAll();
    public Optional<Producto> getProducto(Integer id);
    public void update(Producto producto);
    public void delete(Integer id);
}
