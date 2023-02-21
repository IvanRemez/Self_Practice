package day11_tasks;

import java.util.Scanner;

public class ReplaceX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = input.nextLine();

        input.close();

        word = word.toLowerCase();
        word = word.replace("x", "a");
        //word = word.replace("X", "a");

        System.out.println(word);

    }
}
/*
3. Create a class named ReplaceX, and write a program that asks user to enter a word
and replace all the x or X with character a

                    Input:
                        xcodeX
                    Output:
                        acodea
 */