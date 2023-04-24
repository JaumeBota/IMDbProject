package com.traingft.imdb.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.traingft.imdb.dto.Movies;
import com.traingft.imdb.jpa.MoviesRepository;
import com.traingft.imdb.jpa.model.MoviesEntity;

class MoviesServiceTest {
    
    
    MoviesService moviesService;

    @Mock
    MoviesRepository moviesRepository;


    @Test
    void getAllMovieInformationTest(){

        List<MoviesEntity> expected = moviesRepository.findAllMovieInformationByExpression("inception 2010");

        when(moviesRepository.findAll()).thenReturn(expected);
        List<Movies> actual = moviesService.findAll();
        assertEquals(expected,actual);

        verify(moviesService).getAllMovieInformationByExpression("inception 2010");
        assertTrue(!expected.isEmpty());

        
    }


}
