package day11_tasks;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email: ");
        String email = input.nextLine();

        //int underscore = email.indexOf('_'),
        //        at = email.indexOf('@');

        String first = email.substring(0, email.indexOf('_')),
                last = email.substring(email.indexOf('_') + 1, email.indexOf('@'));

        if (email.contains("_")){
            System.out.println(last + "_" + first + "@gmail.com");
        }else {
            System.out.println(email);
        }

    }
}
/*
8. Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed
   by an underscore and last name.

    Write a program that can swap first name with last name in the email
    (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
 */