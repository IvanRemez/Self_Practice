package day15_tasks;

import java.util.Scanner;

public class UntilNegative {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true){
            System.out.println("Enter a number:");
            int num = input.nextInt();
            if (num < 0){
                break;      // if entered num is negative, terminate loop
            }
            sum += num;     // if entered num is positive,
                            // add to the sum and reassign new sum
        }

        System.out.println(sum);

        input.close();

    }
}
/*
5. Create a class named UntilNegative and Write a program that calculates the sum of
numbers entered by the user until user enters a negative number.
 */