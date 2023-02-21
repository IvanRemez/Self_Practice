package day22_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxMin {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        // adding multiple elements at once by using bulk operation

        int max = list.get(0);
        int min = list.get(0);

        for (Integer each : list) {
            if(each > max){
                max = each;
            }

            if(each < min){
                min = each;
            }

        }

        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
    }
}
/*
8. Write a program that can find the maximum & minimum numbers from an ArrayList
of integers

        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1
 */