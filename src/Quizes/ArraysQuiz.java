package Quizes;

import java.util.Arrays;

public class ArraysQuiz {

    public static void main(String[] args) {

        String[] planets = {"Mercury", "Venus", "Earth", "Mars"};
        int x = planets.length;
        int y = planets[1].length();

        System.out.println(x + " " + y);
    }
}
