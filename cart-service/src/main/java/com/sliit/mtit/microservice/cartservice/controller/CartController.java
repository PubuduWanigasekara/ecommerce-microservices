package com.sliit.mtit.microservice.cartservice.controller;

import com.sliit.mtit.microservice.cartservice.dto.CartRequest;
import com.sliit.mtit.microservice.cartservice.dto.CartResponse;
import com.sliit.mtit.microservice.cartservice.service.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartServiceImpl cartService;

    @PostMapping (consumes = "application/json", produces = "application/json")
    public @ResponseBody
    CartResponse createCart(@RequestBody CartRequest request){

        System.out.println("Add to cart : " + request);

        return cartService.createCart(request);
    }
}
