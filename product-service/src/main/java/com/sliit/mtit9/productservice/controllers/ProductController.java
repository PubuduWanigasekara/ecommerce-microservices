package com.sliit.mtit9.productservice.controllers;

import com.sliit.mtit9.productservice.dto.Products;
import com.sliit.mtit9.productservice.persistence.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api/products", produces = "application/json")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping(value = "/addProduct")
    public @ResponseBody
    String addProduct(@RequestBody Products products){
        productRepository.save(products);
        return "Product added successfully. Product Name: " + products.getProductName();
    }

    @GetMapping(value = "/getAllProducts")
    public @ResponseBody Iterable<Products> getAllProducts(){
        return productRepository.findAll();
    }

    @GetMapping(value = "/getProduct/{id}")
    public @ResponseBody
    Optional<Products> getProduct(@PathVariable Integer id){
        return productRepository.findById(id);
    }

    @PutMapping(value = "/updateProduct")
    public String updateProduct(@RequestBody Products products){
        productRepository.save(products);
        return products.getProductName() + " Updated Successfully";
    }

    @DeleteMapping(value = "/deleteProduct/{id}")
    public @ResponseBody
    String deleteProduct(@PathVariable Integer id){
        productRepository.deleteById(id);
        return id + " Product Deleted Successfully";
    }
}
