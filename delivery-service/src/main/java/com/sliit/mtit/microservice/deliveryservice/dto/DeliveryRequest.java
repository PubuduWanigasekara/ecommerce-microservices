package com.sliit.mtit.microservice.deliveryservice.dto;

import java.util.StringJoiner;

public class DeliveryRequest {

    private String product;
    private String location;
    private String deliveryCharges;
    private String mobileNumber;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDeliveryCharges() {
        return deliveryCharges;
    }

    public void setDeliveryCharges(String deliveryCharges) {
        this.deliveryCharges = deliveryCharges;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DeliveryRequest.class.getSimpleName() + "[", "]")
                .add("product='" + product + "'")
                .add("location='" + location + "'")
                .add("deliveryCharges='" + deliveryCharges + "'")
                .add("mobileNumber='" + mobileNumber + "'")
                .toString();
    }
}
