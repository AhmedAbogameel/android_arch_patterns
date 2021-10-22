package com.example.archpatterns.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.archpatterns.pojo.MovieModel;

public class MovieViewModel extends ViewModel {

//    LiveData<String> movieNameLiveData;
    public  MutableLiveData<String> movieNameMutableLiveData = new MutableLiveData<>();

    public void getMovieName(){
        String movieName = getMovieFromDB().getName();
        movieNameMutableLiveData.setValue(movieName);
    }

    private MovieModel getMovieFromDB() {
        return new MovieModel("CastAway", "10-3-2001", "Sad", "1");
    }

}
