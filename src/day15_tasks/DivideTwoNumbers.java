package day15_tasks;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int a = 50;
        int b = 9;

        int count = 0;

        while (a >= b){
            a -= b;     // while a is bigger or equal to b, subtract b from a and
                        // reassign new value to a
            count++;    // increase count by 1 each time this is true,
                        // giving you the # of times a is divisible by b
        }

        System.out.println(count + " with a remainder of " + a);

    }
}
/*
4.  Create a class named DivideTwoNumbers and Write a program that can divide two
positive numbers without using / (division) and * (multiplication) operators.
 */