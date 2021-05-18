package com.sliit.mtit.microservice.locationservice.dto;

public class LocationCreationResponse {

    private String deliveryId;
    private String message;

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
