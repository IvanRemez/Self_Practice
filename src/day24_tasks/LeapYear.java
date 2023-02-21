package day24_tasks;

import java.time.LocalDate;

public class LeapYear {

    public static boolean isLeapYear(int birthYear){
        return LocalDate.of(birthYear,1,1).isLeapYear();
    }

    public static void main(String[] args) {

        System.out.println(isLeapYear(1991));
    }
}
/*
8. Create a function that accepts an int argument birthYear, return true if the
person was born on leap year, otherwise return false

 */