package com.ECommerceBackendApplication.backend.repository;

import com.ECommerceBackendApplication.backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Inherits findAll(), findById(), save(), and deleteById() automatically
}
