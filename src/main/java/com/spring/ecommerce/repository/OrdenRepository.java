package com.spring.ecommerce.repository;

import com.spring.ecommerce.model.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenRepository extends JpaRepository<Orden, Integer> {

}
