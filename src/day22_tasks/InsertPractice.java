package day22_tasks;

import java.util.Arrays;

public class InsertPractice {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int a = 2;
        int element = 100;
        int[] arr2 = new int[arr.length +1];

        for (int i = 0; i < arr.length; i++) {

            if (i == a){

                arr2[i] = element;
                arr2[i + 1] = arr[i];
            }else {
                if(arr2[i] != 0){
                    arr2[i + 1] = arr[i];
                } else {
                    arr2[i] = arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
/*
3. Insert Task:
        1.1 Create a method named insert that passes three parameters: integer array,
        integer index, integer element. the method inserts the given element to the
        given index of the array and returns the new array

                Ex:
                    arr = {10, 20, 30, 40, 50};

                    insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


        1.2 Create the same function for double array, char array and string array
 */