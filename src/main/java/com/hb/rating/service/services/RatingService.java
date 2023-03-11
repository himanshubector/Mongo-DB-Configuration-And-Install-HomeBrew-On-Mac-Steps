package com.hb.rating.service.services;

import com.hb.rating.service.entities.Rating;

import java.util.List;

public interface RatingService
{
    //create
    Rating createRating(Rating rating);


    //get all ratings
    List<Rating> getRatings();


    //get all ratings by userId
    List<Rating> getRatingByUserId(String userId);


    //get all ratings by hotelId
    List<Rating> getRatingByHotelId(String hotelId);







}
