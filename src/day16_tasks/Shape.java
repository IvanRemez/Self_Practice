package day16_tasks;

public class Shape {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
/*
1. Use a nested loop to print the following shape

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */