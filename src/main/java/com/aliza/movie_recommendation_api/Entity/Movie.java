package com.aliza.movie_recommendation_api.Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
