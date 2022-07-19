package com.Bergan;

import java.util.ArrayList;

public class Cart {
    ArrayList<Movie> movies=new ArrayList<>();


    public ArrayList<Movie> getMovies() {
        return (ArrayList)movies.clone();
    }

    public void addMovie(Movie movie)
    {
        movies.add(movie);

    }

    public  CartMemento save(){
        return new CartMemento(getMovies());
    }

    public void revert(CartMemento cartMemento)
    {
        movies=cartMemento.getMovies();
    }

    @Override
    public String toString() {
        return "Cart{" +
                "movies=" + movies +
                '}';
    }


    static class CartMemento{
        ArrayList<Movie> movies;

        public CartMemento(ArrayList<Movie> movies) {
            this.movies = movies;
        }

        private ArrayList<Movie> getMovies() {
            return movies;
        }
    }
}
