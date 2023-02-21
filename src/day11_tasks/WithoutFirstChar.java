package day11_tasks;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 words: ");
        String word1 = input.nextLine(),
                word2 = input.nextLine();

        input.close();

        word1 = word1.substring(1);
        word2 = word2.substring(1);

        System.out.println(word1 + word2);

    }
}
/*
5. Create a class named WithoutFirstChar. Ask user to enter two words.
Print first word without its first character then print the second word
without its first character.

            Input:
                apple
                banana
            Output:
                ppleanana
 */