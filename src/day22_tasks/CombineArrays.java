package day22_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineArrays {

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr1));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr2));

        list1.addAll(list2);

        System.out.println(list1);



    }
}
/*
7. write a program that can combine two String arrays into one arrayList

                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */