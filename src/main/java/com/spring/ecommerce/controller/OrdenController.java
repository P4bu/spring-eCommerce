package com.spring.ecommerce.controller;

import com.spring.ecommerce.model.Orden;
import com.spring.ecommerce.service.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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

    @PatchMapping("/update/id")
    public void updateOrden(@PathVariable("id") Integer id, @RequestBody Orden orden, Model model){
        Orden orden1 = new Orden();
        Optional<Orden> optionalOrden = ordenService.getOrden(id);
        orden1 = optionalOrden.get();
        model.addAttribute("orden1", orden1);
        ordenService.saveOrden(orden);
    }
}
