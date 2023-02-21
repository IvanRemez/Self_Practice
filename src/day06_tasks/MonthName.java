package day06_tasks;

public class MonthName {

    public static void main(String[] args) {

        int number = 10;

        String result = "";

        if (number == 1) {
            result = "January";
        }
        if (number == 2) {
            result = "February";
        }
        if (number == 3) {
            result = "March";
        }
        if (number == 4) {
            result = "April";
        }
        if (number == 5) {
            result = "May";
        }
        if (number == 6) {
            result = "June";
        }
        if (number == 7) {
            result = "July";
        }
        if (number == 8) {
            result = "August";
        }
        if (number == 9) {
            result = "September";
        }
        if (number == 10) {
            result = "October";
        }
        if (number == 11) {
            result = "November";
        }
        if (number == 12) {
            result = "December";
        }
        System.out.println(result);
    }
}

/*
1. Create a class named MonthName.java
2. An integer variable named number is declared and given,
Write a program that can print the name of the month that the number represents
    Ex: Given:
        number = 10
    output: October
 */