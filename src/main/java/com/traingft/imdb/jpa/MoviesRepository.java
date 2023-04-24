package com.traingft.imdb.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.traingft.imdb.jpa.model.MoviesEntity;

public interface MoviesRepository extends JpaRepository<MoviesEntity,String> {
    
    @Query("from Movies p where p.expression=:expression")
    List<MoviesEntity> findAllMovieInformationByExpression(String expression);

}
