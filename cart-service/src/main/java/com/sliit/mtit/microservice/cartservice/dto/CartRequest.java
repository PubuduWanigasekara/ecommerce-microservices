package com.sliit.mtit.microservice.cartservice.dto;

import java.util.StringJoiner;

import lombok.Data;

@Data
public class CartRequest {

    private String productName;
    private String wishlistID;
    private String price;
    private String productId;
    private String name;
    private String qty;
//    private String price;


}
