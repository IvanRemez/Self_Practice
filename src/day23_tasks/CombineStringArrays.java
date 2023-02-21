package day23_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineStringArrays {

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr1));

        list1.addAll(Arrays.asList(arr2));
        System.out.println(list1);

    }
}
/*
2. write a program that can combine two String arrays into one arrayList

	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};

                output:
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */