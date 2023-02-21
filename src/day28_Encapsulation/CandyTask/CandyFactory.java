package day28_Encapsulation.CandyTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {

        ArrayList<Candy> candies = new ArrayList<>();

        candies.addAll(Arrays.asList(
                new Candy("Oh Henry", 100, 2, true),
                new Candy("Snickers", 90, 2.5, true),
                new Candy("PayDay", 50, 1.5, true),
                new Candy("Skittles", 200, 0.5, false),
                new Candy("Sour Patch Kids", 300, 0.5, false)
        ));

        for (Candy candy : candies) {
            System.out.println(candy.getBrand() + " : $" + candy.getPrice());
        }

    }
}
/*
5.1 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy
 */