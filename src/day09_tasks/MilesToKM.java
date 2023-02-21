package day09_tasks;

import java.util.Scanner;

public class MilesToKM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles: ");

        double mi = input.nextDouble();
        double km = mi * 1.609;

        System.out.println(mi + " miles is equal to " + km + " kilometers");


        input.close();
    }
}
/*
6. Create a class named MilesToKM, write a program that can convert
                    Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
 */