package com.sliit.mtit.microservice.cartservice.dto;

import lombok.Data;

@Data
public class CartCreationResponse {

    private String cartId;
    private String message;
    private String wishlistId;

}
