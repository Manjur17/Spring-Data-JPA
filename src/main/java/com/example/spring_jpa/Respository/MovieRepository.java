package com.example.spring_jpa.Respository;

import com.example.spring_jpa.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, String> { //<DatabaseName, Datatype of the Primary key>
}