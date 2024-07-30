package com.example.myselectshop.product.repository;

import com.example.myselectshop.product.entity.Product;
import com.example.myselectshop.user.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findALlByUser(User user);
}
