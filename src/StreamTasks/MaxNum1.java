package StreamTasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.OptionalInt;

public class MaxNum1 {

    public static void main(String[] args) {

        int[] array = {6, 8, 3, 5, 1, 9};   // 9

        System.out.println(maxValueWithStream(array));

    }

    public static int maxValueWithStream(int[] arr) {

        return Arrays.stream(arr)
                .reduce(Integer::max)
                .getAsInt();
    }

}
/*
Write a function that can return the max number from an int Array
 */