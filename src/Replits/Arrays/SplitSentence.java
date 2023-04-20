package Replits.Arrays;

import java.util.Scanner;

public class SplitSentence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        for (String word : sentence.split(" ")) {

            System.out.println(word);
        }
    }
}
