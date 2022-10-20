package com.codeup.java.movies;

import com.codeup.java.Person;
import com.codeup.java.util.Input;

public class MoviesApplication {
    public static void getMovieByCategory(String category, Movie[] movies){
        for (Movie movie : movies){
            String name = movie.getName();
            if (category.equals(movie.getCategory())){
                System.out.printf("%s -- %s%n", name, category);
            }
        }
    }

    public static Movie [] addedMovieArray(Movie newMovie, Movie[] movies) {
        int i;
        Movie[] newMovieArray = new Movie[movies.length + 1];
        for (i = 0; i < movies.length; i++)
            newMovieArray[i] = movies[i];///setting the new array to the new position of the old array

        newMovieArray[movies.length] = newMovie;
        return newMovieArray;
    }

        public static void main(String[] args) {
        Input movieInput = new Input();
        Movie[] movies = MoviesArray.findAll(); //to assign all the movies to that movies array variable
        String userChoice = "-1"; // as long as it doesn't equal 0 because it will kill the loop
        while (!userChoice.equals("0")) {
            System.out.println("What would you like to do");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("6 - add a movie to this list");
            userChoice = movieInput.getString("Enter your choice: ");
            
            switch(userChoice){
                case "0": //for choice 0
                   break; // do this; don't forget to break!
                case "1":
                    for (Movie movie : movies){
                        String name = movie.getName();
                        String category = movie.getCategory();
                        System.out.printf("%s -- %s%n", name, category);
                    }
                    break;
                case "2":
                    getMovieByCategory("animated", movies);
                    break;
                case "3":
                   getMovieByCategory("drama", movies);
                    break;
                case "4":
                    getMovieByCategory("horror", movies);
                    break;
                case "5":
                    getMovieByCategory( "scifi", movies);
                    break;
                case "6":
                    String title = movieInput.getString("Enter the name of the movie");
                    String category = movieInput.getString("Enter the category of the movie");
                    Movie newMovie = new Movie(title, category);
                    movies = addedMovieArray(newMovie, movies);
                    break;
                default:
                    System.out.println("Please follow instructions and pick a number for your choice.");
            }
        }
    }
}

