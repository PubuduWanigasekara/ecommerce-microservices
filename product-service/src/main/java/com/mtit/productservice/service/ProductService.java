package com.mtit.productservice.service;

import com.mtit.productservice.entity.Product;
import com.mtit.productservice.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        log.info("Inside saveProduct of product service");
        return productRepository.save(product);
    }


    public Product findProductById(Long productId) {
        return productRepository.findByProductId(productId);
    }
}

