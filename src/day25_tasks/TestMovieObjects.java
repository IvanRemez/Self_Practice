package day25_tasks;

import java.time.LocalDate;
import java.util.Arrays;

public class TestMovieObjects {

    public static void main(String[] args) {

        Movie movie1 = new Movie("USA","Bad Boys 2","Action",
                LocalDate.of(2003,7,15), "Michael Bay");

        movie1.addCast("Ozzy");

        String[] casts = {"Ali","Muhtar"};

        movie1.addCasts(casts);

        System.out.println(movie1);
    }

}
/*
Task04:
    1. Create a custom class named  Movie:
        Attributes:
            country, title, Genre, releaseDate, director, casts (ArrayList<String>)

        Add a constructor to set the country, title, release date, and director of
        the Movie

        Actions
            addCast(String): adds the given string argument to the arrayList casts
            addCasts(String[]): adds the given string array argument to the arrayList
            casts
            toString(): returns the name of country, title, release date, and total
            number of casts

    2. create a class called TestMovieObjects

            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 04/18/2021
                    director: Kuzzat Altay
                    Casts: Ozzy, Ali, Muhtar and 5 more students from your group

        print the full info of the movie
 */