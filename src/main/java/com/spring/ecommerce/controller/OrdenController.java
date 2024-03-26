package com.spring.ecommerce.controller;

import com.spring.ecommerce.model.Orden;
import com.spring.ecommerce.service.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ordenes")
public class OrdenController {
    @Autowired
    private OrdenService ordenService;
    @PostMapping("/save")
    public Orden saveOrden(@RequestBody Orden orden){
        return ordenService.saveOrden(orden);
    }
    @GetMapping("/all")
    public List<Orden> getAllOrden(){
        return ordenService.getAllOrden();
    }
    @GetMapping("/orden/{id}")
    public Optional<Orden> getOrden(@PathVariable("id")Integer id){
        return ordenService.getOrden(id);
    }
}
