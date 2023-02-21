package day09_tasks;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();

        System.out.println("Enter a math operator: ");
        char operator = input.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("Invalid Operator");

        }

        input.close();

        /*if (ch != '+' || ch != '-' || ch != '*' || ch != '/'){
            System.out.println("Invalid entry");
        }

        System.out.println("Enter 2nd number: ");
        int n2 = input.nextInt();
        */
        // int result = n1(ch)n2; ???





    }
}
/*
9. Create a class named Calculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a vliad math operator (+, -, *, /),
		then print "Invalid entry"
 */