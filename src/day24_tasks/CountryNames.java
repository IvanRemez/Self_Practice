package day24_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CountryNames {

    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();

        countries.addAll(Arrays.asList(
                "Australia", "Canada", "Bosnia and Herzegovina", "Spain",
                "Argentina", "Malta", "United States of America", "Italy"
        ));
        System.out.println(countries);

        countries.removeIf(p -> p.length() > 10);

        System.out.println(countries);

    }
}
/*
6. Create an ArrayList of string called country names, write a program that can remove
all the country names that have length of 10 or greater
 */