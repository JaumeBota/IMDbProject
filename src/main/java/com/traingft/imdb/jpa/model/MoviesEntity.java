package com.traingft.imdb.jpa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import com.traingft.imdb.dto.SearchResult;

@Entity
@Table(name="MOVIES")
public class MoviesEntity {
    
    @Id
    int id;
    String searchtype;
    String expression;
    List<SearchResult> results;
    String errorMessage;

    public MoviesEntity(String searchtype, String expression, List<SearchResult> results, String errorMessage) {
        this.searchtype = searchtype;
        this.expression = expression;
        this.results = results;
        this.errorMessage = errorMessage;
    }

    public String getSearchtype() {
        return searchtype;
    }

    public void setSearchtype(String searchtype) {
        this.searchtype = searchtype;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public List<SearchResult> getResults() {
        return results;
    }

    public void setResults(List<SearchResult> results) {
        this.results = results;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }


    
}
