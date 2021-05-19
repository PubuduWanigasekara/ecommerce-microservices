package com.sliit.mtit.microservice.wishlistservice.dto;

import java.util.StringJoiner;

import lombok.Data;

@Data
public class WishlistRequest {

    private String productId;
    private String price;
    private String name;
    private String qty;

}
