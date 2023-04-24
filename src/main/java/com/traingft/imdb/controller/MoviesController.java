package com.traingft.imdb.controller;
import com.traingft.imdb.dto.Movies;
import com.traingft.imdb.service.MoviesService;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MoviesController {

    MoviesService moviesService;

    @GetMapping(value="/movie")
    public List<Movies> getAllMovieInformationByExpression(@RequestParam String expression) {
        return moviesService.getAllMovieInformationByExpression(expression);
    }
    
    
    
}
