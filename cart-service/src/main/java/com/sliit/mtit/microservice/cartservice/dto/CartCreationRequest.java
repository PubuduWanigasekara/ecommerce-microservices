package com.sliit.mtit.microservice.cartservice.dto;

import lombok.Data;

@Data
public class CartCreationRequest {

    private String cartID;
    private String productName;
    private String wishlistID;
    private String price;

}
