package com.example.myselectshop.product.repository;

import com.example.myselectshop.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
