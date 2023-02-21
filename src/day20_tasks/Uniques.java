package day20_tasks;

public class Uniques {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5, 5, 6};

        for (int each : arr) {

            int uniqueCount = 0;

            for (int element : arr) {

                if (each == element){
                    uniqueCount++;
                }
            }
            if (uniqueCount == 1){
                System.out.println(each);
            }
        }

    }
}
/*
5. Write a program that can display the unique elements of an array

			MUST use for each loops
 */