package com.spring.ecommerce.controller;

import com.spring.ecommerce.model.Producto;
import com.spring.ecommerce.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ProductoController  {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/all")
    public List<Producto> getAll(){
        return productoService.getAll();
    }
    @PostMapping("/save")
    public Producto save(@RequestBody Producto producto){
        return productoService.save(producto);
    }

    @GetMapping("/producto/{id}")
    public Optional<Producto> getProducto(@PathVariable("id") Integer id){
        return productoService.getProducto(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        productoService.delete(id);
    }
    @PostMapping("/update")
    public void update(Producto producto){
        productoService.update(producto);
    }



}
