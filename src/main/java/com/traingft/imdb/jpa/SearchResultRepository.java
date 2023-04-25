package com.traingft.imdb.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.traingft.imdb.jpa.model.SearchResultEntity;

public interface SearchResultRepository extends JpaRepository<SearchResultEntity,String> {
    
    @Query("from SEARCH p where p.title=:title")
    List<SearchResultEntity> findAllMovieInformationByExpression(String expression);

}
