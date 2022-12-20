package com.example.spring_jpa.Controller;

import com.example.spring_jpa.Model.Movie;
import com.example.spring_jpa.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/get_movies")
    public List<Movie> getMovies() {
        return movieService.getAllMovies();
    }

    @PostMapping("/add_movie")
    public void addMovie(@RequestBody() Movie movie) {
        movieService.addMovie(movie);
    }

}