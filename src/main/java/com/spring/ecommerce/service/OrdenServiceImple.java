package com.spring.ecommerce.service;

import com.spring.ecommerce.model.Orden;
import com.spring.ecommerce.repository.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrdenServiceImple implements OrdenService{

    @Autowired
    private OrdenRepository ordenRepository;
    @Override
    public Orden saveOrden(Orden orden) {
        return ordenRepository.save(orden);
    }

    @Override
    public List<Orden> getAllOrden() {
        List<Orden> allOrden = ordenRepository.findAll();
        return allOrden;
    }

    @Override
    public Optional<Orden> getOrden(Integer id) {
        return ordenRepository.findById(id);
    }


}
