package com.traingft.imdb.service;

import org.springframework.stereotype.Component;

import com.traingft.imdb.dto.Movies;
import com.traingft.imdb.jpa.model.MoviesEntity;

import org.modelmapper.ModelMapper;

@Component
public class Mapper {
    
    private ModelMapper mapper;

    public Mapper() {
		this.mapper = new ModelMapper();
	}


    public Movies toMoviesDTO(MoviesEntity entity) {
		return mapper.map(entity, Movies.class);
	}
}
