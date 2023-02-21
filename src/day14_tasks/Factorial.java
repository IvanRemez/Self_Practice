package day14_tasks;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        int i, fact = 1;
        int n = 5;

        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        System.out.println("------------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        double num = scan.nextInt();

        double result = 1;

        for (int j = (int)num; j >= 1; j--) {

            result *= j;
        }
        System.out.println("result = " + result);

        scan.close();
    }
}
/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */