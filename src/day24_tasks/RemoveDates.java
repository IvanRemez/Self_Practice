package day24_tasks;

import java.time.LocalDate;
import java.util.ArrayList;

public class RemoveDates {

    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1991, 9, 6);
        LocalDate hireDate = LocalDate.of(2021, 6,5);
        LocalDate date1 = LocalDate.of(2018,2,20);

        ArrayList<LocalDate> dates = new ArrayList<>();

        dates.add(birthday);
        dates.add(hireDate);
        dates.add(date1);

        System.out.println(dates);

        dates.removeIf(p -> p.isBefore(LocalDate.of(2016,8,15)));

        System.out.println(dates);


    }

}
/*
9. create an Arraylist of LocalDate, write a program that can remove all the
dates before August-15-2016

 */