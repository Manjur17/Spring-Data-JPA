package com.example.spring_jpa.Service;

import com.example.spring_jpa.Model.Movie;
import com.example.spring_jpa.Respository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //already has component inside it
public class MovieService {

    @Autowired
    MovieRepository movieRepository; //dynamic binding

    public List<Movie> getAllMovies(){
        return movieRepository.findAll(); //using JPA methods and not any query
    }

    public void addMovie(Movie movie){
        movieRepository.save(movie);
    }
}