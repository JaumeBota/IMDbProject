package com.traingft.imdb.dto;

public class SearchResult {
    
    String id;
    String resulttype;
    String image;
    String title;
    String description;
    
    public SearchResult(String id, String resulttype, String image, String title, String description) {
        this.id = id;
        this.resulttype = resulttype;
        this.image = image;
        this.title = title;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResulttype() {
        return resulttype;
    }

    public void setResulttype(String resulttype) {
        this.resulttype = resulttype;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

}
