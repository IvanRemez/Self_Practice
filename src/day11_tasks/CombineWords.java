package day11_tasks;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 words: ");
        String word1 = input.nextLine(),
                word2 = input.nextLine();

        input.close();

        char first = word2.charAt(0);
        char last = word1.charAt(word1.length()-1);

        if (first == last){
            System.out.println(word1 + word2.substring(1));
        }else {
            System.out.println(word1 + " " + word2);
        }

    }
}
/*
6. Create a class named CombineWords. Ask user to enter two words. Then add them
together and print.
    But if the last letter of the first word and the first letter of the last
    word is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
 */