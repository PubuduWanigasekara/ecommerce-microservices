package com.sliit.mtit.microservice.locationservice.dto;

import java.util.StringJoiner;

import lombok.Data;

@Data
public class LocationRequest {

    private String no;
    private String city;
    private String district;
    private String province;
    private String country;
    private String product;
    private String location;
    private String deliveryCharges;
    private String mobileNumber;

}
