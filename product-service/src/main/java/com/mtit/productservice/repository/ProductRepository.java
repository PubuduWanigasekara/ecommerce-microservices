package com.mtit.productservice.repository;

import com.mtit.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

    Product findByProductId (Long productId);
}
