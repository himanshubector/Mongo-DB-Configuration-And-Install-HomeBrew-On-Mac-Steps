package com.hb.rating.service.controllers;


import com.hb.rating.service.entities.Rating;
import com.hb.rating.service.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController
{

    @Autowired
    private RatingService ratingService;


    //create
    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating)
    {
        Rating rating1 = ratingService.createRating(rating);

        return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
    }



    //find all ratings
    @GetMapping
    public ResponseEntity<List<Rating>> getAllRatings()
    {
        List<Rating> ratings = ratingService.getRatings();

        return ResponseEntity.status(HttpStatus.OK).body(ratings);
    }



    // find all ratings by userId
    @GetMapping("/users/{userId}")
    public ResponseEntity getRatingByUserId(@PathVariable String userId)
    {
        List<Rating> ratingsByUserId = ratingService.getRatingByUserId(userId);

        return ResponseEntity.status(HttpStatus.OK).body(ratingsByUserId);
    }




    //find all ratings by hotelId
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity getRatingByHotelId(@PathVariable String hotelId)
    {
        List<Rating> ratingsByHotelId = ratingService.getRatingByHotelId(hotelId);

        return ResponseEntity.status(HttpStatus.OK).body(ratingsByHotelId);
    }

}
