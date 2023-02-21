package day08_tasks;

public class BiggerNum {

    public static void main(String[] args) {

        int n1 = 10,
                n2 = 15,
                n3 = 20;
        String result = "";

        result = (n1 > n2 && n1 > n3) ? "n1 is largest"
                : (n2 > n1 && n2 < n3) ? "n2 is largest"
                : (n3 > n1 && n3 > n2) ? "n3 is largest"
                : "Invalid";

        System.out.println(result);

    }
}
/*
6. Create a class called BiggerNum, write a program that checks for the biggest of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY
 */