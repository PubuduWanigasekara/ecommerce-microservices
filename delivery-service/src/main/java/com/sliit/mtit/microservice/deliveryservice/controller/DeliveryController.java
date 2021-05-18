package com.sliit.mtit.microservice.deliveryservice.controller;

import com.sliit.mtit.microservice.deliveryservice.dto.DeliveryRequest;
import com.sliit.mtit.microservice.deliveryservice.dto.DeliveryResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    DeliveryResponse createUser(@RequestBody DeliveryRequest deliveryRequest){

        System.out.println("Delivery Details : " + deliveryRequest);

        var deliveryResponse = new DeliveryResponse();
        deliveryResponse.setDeliveryId(UUID.randomUUID().toString());
        deliveryResponse.setMessage("Successfully delivered");

        return deliveryResponse;
    }
}
