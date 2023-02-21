package day24_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxAndMin {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));
        System.out.println(list);

        list.removeIf(p -> p == Collections.max(list));
        list.removeIf(p -> p == Collections.min(list));
        System.out.println(list);

        System.out.println("second maximum number is " + Collections.max(list));
        System.out.println("second minimum number is " + Collections.min(list));

    }
}
/*
5. Write a program that can display the second maximum and minimum numbers from an
    arraylist of integers

		ex:
			list = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8}

		output:
			second maximum number is 7
			second minimum number is 1

	Note: DO NOT use any loops
 */