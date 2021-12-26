package com.example.recyclerview;

import android.content.Intent;

public class MovieData {

    private String MovieName;
    private String MovieDate;

    private Integer img;


    public MovieData(String movieName, String movieDate, Integer img) {
        MovieName = movieName;
        MovieDate = movieDate;
        this.img = img;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getMovieDate() {
        return MovieDate;
    }

    public void setMovieDate(String movieDate) {
        MovieDate = movieDate;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }
}
