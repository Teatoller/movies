package com.ennis.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    // Database access methods
    @Autowired // instantiate the MovieRepository class for us
    private MovieRepository movieRepository;
    public ResponseEntity<List<Movie>>  allMovies(){
        return new ResponseEntity<List<Movie>>(movieRepository.findAll(), HttpStatus.OK) ;

    }
}
