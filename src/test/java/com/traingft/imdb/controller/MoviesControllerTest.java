package com.traingft.imdb.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.traingft.imdb.BaseTestsWithConstructors;
import com.traingft.imdb.dto.Movies;
import com.traingft.imdb.service.MoviesService;

class MoviesControllerTest extends BaseTestsWithConstructors{
    
    @Mock
    MoviesService moviesService;


    @Mock
    MoviesController moviesController;

    @BeforeEach
    public void onInit(){
        MockitoAnnotations.openMocks(this);
    }
    

    @ParameterizedTest
    @MethodSource("expressionArgument")
    void getAllMovieInformationTestByExpression(String expression){

        List<Movies> listExpected = moviesController.getAllMovieInformationByExpression(expression);

        verify(moviesController).getAllMovieInformationByExpression(expression);
        assertEquals(listExpected, moviesController.getAllMovieInformationByExpression(expression));
    }

   static Stream<Arguments> expressionArgument(){
        return Stream.of(Arguments.of("inception 2010"));
    }

}
