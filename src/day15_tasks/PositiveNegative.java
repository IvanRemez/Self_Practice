package day15_tasks;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        int positiveNums = 0;
        int negativeNums = 0;

        for (int i = 1; i <= 5; i++) {  // 5 int inputs

            int num = input.nextInt();  // int input

            if (num > 0){       // if num positive, increase positiveNums by 1
                positiveNums++;
            }else if (num < 0){             // if num negative, increase negativeNums by 1
                negativeNums++;
            }
        }
        System.out.println(positiveNums + " positive and " + negativeNums + " negative");

        input.close();
    }
}
/*
2. Create a class named PositiveNegative and write a program that asks user to enter
number for 5 times, and print how many positive and negative numbers user entered

			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */