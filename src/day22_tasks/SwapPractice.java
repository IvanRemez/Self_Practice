package day22_tasks;

import java.util.Arrays;

public class SwapPractice {

    public static void main(String[] args) {

        /*int x = 10;
        int y = 20;
        int temp = y;

        y = x;

        System.out.println(y);
        System.out.println(x);

        x = temp;

        System.out.println(x);

        System.out.println(temp);

         */


                //           50
        int[] arr = {10, 20, 30, 40, 50};

        int temp = arr[2]; // 30

        arr[2] = arr[4];
        arr[4] = temp;

        System.out.println(Arrays.toString(arr));

        swap(arr, 0, 3);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] swap(int[] arr, int i, int j){

        int temp = arr[i]; // 30

        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }



}
/*
4. Swap Task:
    2.1 Create a method named swap that passes three parameters: integer array,
    integer i, integer j. the method swaps the element at index i with the element
    at index j, and returns the new array

            Ex:
                arr = {10, 20, 30, 40, 50};

                swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

    2.2 Create the same function for double array, char array and string array
 */
/*
    public static int[] swap(int[] arr, int i, int j){

        int temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }
    }
 */