package com.sliit.mtit9.cartservice.services;

import com.sliit.mtit9.cartservice.dto.ProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.awt.print.PrinterGraphics;
import java.util.HashMap;
import java.util.Map;

@Service
public class CardServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<ProductRequest> getProduct(Integer id){
        Map<String, Integer> params = new HashMap<>();
        params.put("id", id);
        ResponseEntity<ProductRequest> productResponse = restTemplate.getForEntity("http://localhost:8081/api/products/getProduct/{id}",ProductRequest.class , params);
        return productResponse;
    }
}
