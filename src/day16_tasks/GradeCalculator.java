package day16_tasks;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){

            System.out.println("Enter your score:");
            int s = input.nextInt();

            if (s < 0 || s > 100){
                System.err.println("Invalid Entry");
                System.exit(1);
            }
            char grade = (s >= 90) ? 'A' : (s >= 80 && s < 90) ? 'B' :
                    (s >= 70 && s < 80) ? 'C' : (s >= 60 && s < 70) ? 'D' : 'F';

            System.out.println("grade = " + grade);

            System.out.println("Would you like to continue?");
            String a = input.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))){
                System.err.println("Invalid Entry");
                System.exit(1);
            }
            if (a.equals("no")){
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                break;
            }

        }
        input.close();

    }
}
/*
7. Write a program for grade calculator:
                        1. Ask the user "Enter your score"
                                If user enters invalid score, terminate the program
                                after displaying the error message "Invalid Entry"

                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F

                        2. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade
                                Calculator APP"

                                If user enters an invalid entry, terminate the program
                                after displaying the error message "Invalid Entry"


                         Hint: you can use  System.exit(1) to terminate the entire program
 */