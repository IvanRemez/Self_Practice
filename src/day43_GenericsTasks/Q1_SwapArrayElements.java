package day43_GenericsTasks;

import java.util.Arrays;

public class Q1_SwapArrayElements {

    public static void main(String[] args) {

        Integer[] a = {1,2,3,4};

        swap(a,0,2); System.out.println(Arrays.toString(a)); //[3,2,1,4]
    }

    /*
    public static Integer[] swap(Integer[] a, int x, int y){

        int temp = a[x];

        a[x] = a[y];
        a[y] = temp;

        return a;
    }
     */

    private static <T> void swap(T[] a, int i, int j){
               // ^^ Generic Type ^^

        T temp = a[i];

        a[i] = a[j];
        a[j] = temp;
    }

}
/*
Write a generic method to exchange the positions of two different elements in array.
Sample output:
Integer[] a = {1,2,3,4};
swap(a,0,2); System.out.println(Arrays.toString(a)); //[3,2,1,4]
 */