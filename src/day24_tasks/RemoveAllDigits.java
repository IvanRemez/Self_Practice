package day24_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveAllDigits {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));
        System.out.println(list);

        list.removeIf(p -> Character.isDigit(p));
        System.out.println(list);

    }
}
/*
2. Write a program that can remove all the digits from an arraylist of characters

		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			['$', 'A', 'B', 'C', 'D', '@', '!']

	Note: DO NOT use any loops
 */