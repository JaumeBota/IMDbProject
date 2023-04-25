package com.traingft.imdb.jpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SEARCH")
public class SearchResultEntity {

    @Id
    private String id;
    private String searchtype;
    private String expression;
    private String errormessage;

    public SearchResultEntity(String id, String searchtype, String expression, String errormessage) {
        this.id = id;
        this.searchtype = searchtype;
        this.expression = expression;
        this.errormessage = errormessage;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
    public String getErrorMessage() {
        return errormessage;
    }
    public void setErrorMessage(String errormessage) {
        this.errormessage = errormessage;
    }


    
    
}
