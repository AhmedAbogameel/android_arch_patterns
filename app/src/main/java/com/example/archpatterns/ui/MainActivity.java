package com.example.archpatterns.ui;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.archpatterns.R;
import com.example.archpatterns.pojo.MovieModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView movieNameTV;
    Button getMovieButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieNameTV = findViewById(R.id.movieNameTV);
        getMovieButton = findViewById(R.id.getMovieButton);
        getMovieButton.setOnClickListener(this);
    }

    public MovieModel getMovieFromDB() {
        return new MovieModel("CastAway", "10-3-2001", "Sad", "1");
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.getMovieButton){
            movieNameTV.setText(getMovieFromDB().getName());
        }
    }
}