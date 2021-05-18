package com.sliit.mtit.microservice.locationservice.dto;

import lombok.Data;

@Data
public class LocationResponse {

    private String locationId;
    private String deliveryId;
    private String message;

}
