package com.traingft.imdb.service;

import static org.mockito.Mockito.when;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.traingft.imdb.BaseTestsWithConstructors;
import com.traingft.imdb.dto.Movies;
import com.traingft.imdb.dto.SearchResult;
import com.traingft.imdb.jpa.MoviesRepository;
import com.traingft.imdb.jpa.SearchResultRepository;

class MoviesServiceTest extends BaseTestsWithConstructors{
    
    
    MoviesService moviesService;
    Mapper mapper;

    @Mock
    MoviesRepository moviesRepository;
    @Mock
    SearchResultRepository searchResultRepository;

    @BeforeEach
    public void onInit(){
        MockitoAnnotations.openMocks(this);
        mapper = new Mapper();
        moviesService = new MoviesService(moviesRepository,searchResultRepository,mapper);
    }

    @Test
    void getAllMovieInformationTest(){
        List<SearchResult> searchList = toList(tosearchResultDTO("tt1375666","Title",
         "https://m.media-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_Ratio0.6800_AL_.jpg",
         "inception 2010", "(2010)"));
        List<Movies> expected = toList(toMoviesDTO("Movie","inception 2010",searchList,""));

        when(moviesService.findAll()).thenReturn(expected);

        Assertions.assertThat(expected)
                  .extracting(Movies::getExpression)
                  .contains("inception 2010");


        
    }


}
