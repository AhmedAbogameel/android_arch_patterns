package com.example.archpatterns.ui;

import com.example.archpatterns.pojo.MovieModel;

public class MoviePresenter {

    MovieView view;

    public MoviePresenter(MovieView view) {
        this.view = view;
    }

    public MovieModel getMovieFromDB() {
        return new MovieModel("CastAway", "10-3-2001", "Sad", "1");
    }

    public void getMovieName(){
        view.onGetMovieName(getMovieFromDB().getName());
    }

}
