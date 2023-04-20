package Replits.Arrays;

import java.util.Scanner;

public class BiggestWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }

        int index = 0;
        int elementLength = words[0].length();

        for (int i = 1; i < words.length; i++) {

            if (words[i].length() > elementLength) {
                index = i;
                elementLength = words[i].length();
            }
        }
        System.out.println(words[index]);
    }
}
