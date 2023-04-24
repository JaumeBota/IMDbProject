package com.traingft.imdb.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.traingft.imdb.dto.Movies;

class MoviesControllerTest {
    
    @Mock
    MoviesController searchMoviesController;

    

    @Test
    void getAllMovieInformationTestByExpression(String expression){

        List<Movies> expected = searchMoviesController.getAllMovieInformationByExpression(expression);

        verify(searchMoviesController).getAllMovieInformationByExpression(expression);
        assertEquals(expected, searchMoviesController.getAllMovieInformationByExpression(expression));
    }


}
