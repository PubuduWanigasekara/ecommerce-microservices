package com.sliit.mtit.microservice.deliveryservice.dto;

import java.util.StringJoiner;

import lombok.Data;

@Data
public class DeliveryRequest {

    private String product;
    private String location;
    private String deliveryCharges;
    private String mobileNumber;

}
