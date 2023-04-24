package com.traingft.imdb;

import java.util.Collections;
import java.util.List;

import com.traingft.imdb.dto.SearchResult;
import com.traingft.imdb.jpa.model.MoviesEntity;

public class BaseTestsWithConstructors {
    



    protected MoviesEntity moviesEntity(String searchtype, String expression, List<SearchResult> resultsList, String errorMessage){

       MoviesEntity moviesEntity = new MoviesEntity(searchtype, expression, resultsList, errorMessage);
       
        moviesEntity.setSearchtype(searchtype);
        moviesEntity.setExpression(expression);
        moviesEntity.setResults(resultsList = Collections.emptyList());
        moviesEntity.setErrorMessage(errorMessage);
       return moviesEntity;
    }
}
