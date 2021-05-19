package com.sliit.mtit.microservice.cartservice.service;

import com.sliit.mtit.microservice.cartservice.dto.CartRequest;
import com.sliit.mtit.microservice.cartservice.dto.CartResponse;
import com.sliit.mtit.microservice.cartservice.dto.CartCreationRequest;
import com.sliit.mtit.microservice.cartservice.dto.CartCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class CartServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public CartResponse createCart(CartRequest cartRequest){

        var cartCreationRequest = new CartCreationRequest();
        cartCreationRequest.setProductName(cartRequest.getProductName());
        cartCreationRequest.setPrice(cartRequest.getPrice());
        cartCreationRequest.setWishlistID(cartRequest.getWishlistID());
        ResponseEntity<CartCreationResponse> cartCreationResponse =  restTemplate.postForEntity("http://localhost:9075/wishlist",cartCreationRequest, CartCreationResponse.class);

        var cartResponse = new CartResponse();
        cartResponse.setCartId(UUID.randomUUID().toString());
        cartResponse.setWishlistId(cartCreationResponse.getBody().getWishlistId());
        cartResponse.setMessage("Successfully entered the location");

        return cartResponse;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

}
