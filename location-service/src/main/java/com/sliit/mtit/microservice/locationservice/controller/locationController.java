package com.sliit.mtit.microservice.locationservice.controller;

import com.sliit.mtit.microservice.locationservice.dto.LocationRequest;
import com.sliit.mtit.microservice.locationservice.dto.LocationResponse;
import com.sliit.mtit.microservice.locationservice.service.LocationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/location")
public class locationController {
    @Autowired
    private LocationServiceImpl locationService;

    @PostMapping (consumes = "application/json", produces = "application/json")
    public @ResponseBody LocationResponse createLocation(@RequestBody LocationRequest request){

        System.out.println("Location Details : " + request);

        return locationService.createLocation(request);
    }
}
