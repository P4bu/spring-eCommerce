package com.spring.ecommerce.service;

import com.spring.ecommerce.model.Orden;

import java.util.List;
import java.util.Optional;

public interface OrdenService {
    public Orden saveOrden(Orden orden);
    public List<Orden> getAllOrden();
    public Optional<Orden> getOrden(Integer id);
}
