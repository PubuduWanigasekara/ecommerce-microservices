package com.sliit.mtit.microservice.locationservice.dto;

public class LocationResponse {

    private String locationId;
    private String message;

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
