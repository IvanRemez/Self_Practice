package day11_tasks;

import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your First name: ");
        String firstName = input.nextLine();

        System.out.println("Enter your Last name: ");
        String lastName = input.nextLine();

        input.close();

        String start1 = firstName.substring(0, 1).toUpperCase(),
                start2 = lastName.substring(0, 1).toUpperCase();

        String rest1 = firstName.substring(1).toLowerCase(),
                rest2 = lastName.substring(1).toLowerCase();

        System.out.println(start1 + rest1 + " " + start2 + rest2);


    }
}
/*
7. Write a program that asks user to enter first and last names, and then
prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */