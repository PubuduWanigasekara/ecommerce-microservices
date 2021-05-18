package com.sliit.mtit.microservice.locationservice.service;

import com.sliit.mtit.microservice.locationservice.dto.LocationRequest;
import com.sliit.mtit.microservice.locationservice.dto.LocationResponse;
import com.sliit.mtit.microservice.locationservice.dto.LocationCreationRequest;
import com.sliit.mtit.microservice.locationservice.dto.LocationCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class LocationServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public LocationResponse createLocation(LocationRequest locationRequest){

        var locationCreationRequest = new LocationCreationRequest();
        locationCreationRequest.setProduct(locationRequest.getProduct());
        locationCreationRequest.setLocation(locationRequest.getLocation());
        locationCreationRequest.setDeliveryCharges(locationRequest.getDeliveryCharges());
        locationCreationRequest.setMobileNumber(locationRequest.getMobileNumber());
        ResponseEntity<LocationCreationResponse> locationCreationResponse =  restTemplate.postForEntity("http://localhost:8080/delivery",locationCreationRequest, locationCreationResponse.class);

        var locationResponse = new LocationResponse();
        locationResponse.setLocationId(UUID.randomUUID().toString());
        locationResponse.setDeliveryId(locationCreationResponse.getBody().getDeliveryId());
        locationResponse.setMessage("Successfully entered the location");

        return locationResponse;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

}
