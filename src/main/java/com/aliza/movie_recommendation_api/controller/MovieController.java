package com.aliza.movie_recommendation_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @GetMapping("/movies")
    public String getMovies(){
        return "Movie API is working " ;
    }
}
