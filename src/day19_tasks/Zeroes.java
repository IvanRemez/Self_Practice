package day19_tasks;

import java.util.Arrays;

public class Zeroes {

    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};
        int[] newArray = new int[array.length];

        int j = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] != 0){
                newArray[j++] = array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));

    }
}
/*
7. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */