package com.aliza.movie_recommendation_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Movie {
    private String id;
    private String title;
    private String genre;
    private String director;
    private int releaseYear;
    private double rating;
    private String language;

}
