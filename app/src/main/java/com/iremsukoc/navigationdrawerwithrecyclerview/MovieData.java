package com.iremsukoc.navigationdrawerwithrecyclerview;

public class MovieData {

    String movieName;
    String movieDirector;
    int movieImage;

    public MovieData(String movieName, String movieDirector, int movieImage) {
        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.movieImage = movieImage;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public int getMovieImage() {
        return movieImage;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public void setMovieImage(int movieImage) {
        this.movieImage = movieImage;
    }
}
