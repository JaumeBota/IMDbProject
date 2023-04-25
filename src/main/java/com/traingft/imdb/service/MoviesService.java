package com.traingft.imdb.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.traingft.imdb.dto.Movies;
import com.traingft.imdb.jpa.MoviesRepository;
import com.traingft.imdb.jpa.SearchResultRepository;
import com.traingft.imdb.jpa.model.MoviesEntity;

@Service
public class MoviesService {
    
    MoviesRepository moviesRepository;
    SearchResultRepository searchResultRepository;
    Mapper mapper;

    


    public MoviesService(MoviesRepository moviesRepository,SearchResultRepository searchResultRepository ,Mapper mapper) {
        this.moviesRepository = moviesRepository;
        this.searchResultRepository = searchResultRepository;
        this.mapper = mapper;
    }


    public List<Movies> findAll(){
        List<MoviesEntity> movieEntityList = moviesRepository.findAll();

        return movieEntityList.stream().map( e -> mapper.toMoviesDTO(e)).collect(Collectors.toList());
    }


    public List<Movies> getAllMovieInformationByExpression(String expression){
        
        List<MoviesEntity> movieEntityList = moviesRepository.findAllMovieInformationByExpression(expression);

        return movieEntityList.stream().map( e -> mapper.toMoviesDTO(e)).collect(Collectors.toList());
    }
}
