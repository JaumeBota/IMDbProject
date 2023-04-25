package com.traingft.imdb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.traingft.imdb.dto.Movies;
import com.traingft.imdb.dto.SearchResult;
import com.traingft.imdb.jpa.model.MoviesEntity;
import com.traingft.imdb.jpa.model.SearchResultEntity;

public class BaseTestsWithConstructors {
    



    protected MoviesEntity moviesEntity(String searchtype, String expression, List<SearchResult> resultsList, String errorMessage){

       MoviesEntity moviesEntity = new MoviesEntity(searchtype, expression, resultsList, errorMessage);
       
        moviesEntity.setSearchtype(searchtype);
        moviesEntity.setExpression(expression);
        moviesEntity.setResults(resultsList = Collections.emptyList());
        moviesEntity.setErrorMessage(errorMessage);
       return moviesEntity;
    }

    protected Movies toMoviesDTO(String searchtype, String expression, List<SearchResult> resultsList, String errorMessage){

        Movies movies = new Movies(searchtype, expression, resultsList, errorMessage);
        
         movies.setSearchtype(searchtype);
         movies.setExpression(expression);
         movies.setResults(resultsList = Collections.emptyList());
         movies.setErrorMessage(errorMessage);
        return movies;
     }

    protected SearchResultEntity searchResultEntity(String id, String searchtype, String expression, String errorMessage){
        SearchResultEntity searchResultEntity = new SearchResultEntity(id,searchtype,expression,errorMessage);

        searchResultEntity.setId(id);
        searchResultEntity.setExpression(expression);
        searchResultEntity.setSearchtype(searchtype);
        searchResultEntity.setErrorMessage(errorMessage);
        return searchResultEntity;
    }

    protected SearchResult tosearchResultDTO(String id, String resulttype, String image, String title, String description){
        SearchResult searchResult = new SearchResult(id,resulttype,image,title,description);

        searchResult.setId(id);
        searchResult.setResulttype(resulttype);
        searchResult.setImage(image);
        searchResult.setTitle(title);
        searchResult.setDescription(description);

        return searchResult;
    }

    protected List<Movies> toList(Movies movieDtos){
        return Arrays.asList(movieDtos);
    }

    protected List<MoviesEntity> toList(MoviesEntity moviesEntity){
        return Arrays.asList(moviesEntity);
    }

    protected List<SearchResultEntity> toList(SearchResultEntity searchResultEntity){
        return Arrays.asList(searchResultEntity);
    }

    protected List<SearchResult> toList(SearchResult searchResult){
        return Arrays.asList(searchResult);
    }
}
