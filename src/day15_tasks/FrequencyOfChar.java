package day15_tasks;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = input.nextLine(); // users one line string
        System.out.println("Enter a character:");
        char ch = input.next().charAt(0); // users char input (0 index)

        int frequency = 0;  // frequency variable starting at 0

        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i); // check each char of String against users char
            if (eachChar == ch){     // any occurrence of users char in the String increases frequency by 1
                frequency++;
            }
        }

        System.out.println(frequency);

        input.close();

    }
}
/*
3. Create a class named FrequencyOfChar and Write a program that asks user to enter
a string and a char, the returns the frequency of the char from the given string

            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */