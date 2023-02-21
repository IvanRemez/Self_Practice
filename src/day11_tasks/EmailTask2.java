package day11_tasks;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email: ");
        String email = input.nextLine();

        int underscore = email.indexOf("_"),
                at = email.indexOf("@"),
                dot = email.indexOf(".");

        String start1 = email.substring(0, 1).toUpperCase(),
                start2 = email.substring(underscore + 1, underscore + 2).toUpperCase();

        String rest1 = email.substring(1, underscore).toLowerCase(),
                rest2 = email.substring(underscore + 2, at).toLowerCase(),
                domain = email.substring(at + 1, dot);

        System.out.println("First name: " + start1 + rest1);
        System.out.println("Last name: " + start2 + rest2);
        System.out.println("Domain: " + domain);

    }
}
/*
9. Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed
   by an underscore and last name.

   Write a program that will print out information about user based on email.
   Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first
   letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
 */