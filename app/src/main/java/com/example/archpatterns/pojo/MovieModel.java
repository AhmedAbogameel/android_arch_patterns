package com.example.archpatterns.pojo;

public class MovieModel {

    private String name;
    private String date;
    private String details;
    private String id;

    public MovieModel(String name, String date, String details, String id) {
        this.name = name;
        this.date = date;
        this.details = details;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
