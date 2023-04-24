package com.traingft.imdb.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.traingft.imdb.dto.Movies;
import com.traingft.imdb.jpa.MoviesRepository;
import com.traingft.imdb.jpa.model.MoviesEntity;

@Service
public class MoviesService {
    
    MoviesRepository moviesRepository;
    Mapper mapper;


    public List<Movies> findAll(){
        List<MoviesEntity> movieEntityList = moviesRepository.findAll();

        return movieEntityList.stream().map((e) -> mapper.toMoviesDTO(e)).collect(Collectors.toList());
    }


    public List<Movies> getAllMovieInformationByExpression(String expression){
        
        List<MoviesEntity> movieEntityList = moviesRepository.findAllMovieInformationByExpression(expression);

        return movieEntityList.stream().map((e) -> mapper.toMoviesDTO(e)).collect(Collectors.toList());
    }
}
