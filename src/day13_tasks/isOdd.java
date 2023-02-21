package day13_tasks;

public class isOdd {

    public static boolean isOdd(int num){

        return (num % 2 != 0) ? true : false;
    }

    public static void main(String[] args) {

        System.out.println(isOdd(3));

    }
}
/*
1. Create a method named isOdd, that can return true if a number is an odd number,
otherwise returns false

 */