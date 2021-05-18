package com.sliit.mtit.microservice.locationservice.dto;

import lombok.Data;

@Data
public class  LocationCreationRequest {

    private String product;
    private String location;
    private String deliveryCharges;
    private String mobileNumber;

}
