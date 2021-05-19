package com.sliit.mtit.microservice.wishlistservice.controller;

import com.sliit.mtit.microservice.wishlistservice.dto.WishlistRequest;
import com.sliit.mtit.microservice.wishlistservice.dto.WishlistResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/wishlist")
public class WishlistController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    WishlistResponse createUser(@RequestBody WishlistRequest wishlistRequest){

        System.out.println("Wishlist Details : " + wishlistRequest);

        var wishlistResponse = new WishlistResponse();
        wishlistResponse.setWishlistId(UUID.randomUUID().toString());
        wishlistResponse.setMessage("Successfully added to wishlist");

        return wishlistResponse;
    }
}
