package ExtraTasks;

import java.util.Arrays;

public class InterviewQ {

    public static void main(String[] args) {

        int[] arr = {1,1,1,1,1};

        int[] newArr;

        if (arr.length % 2 == 0){
            newArr = new int[arr.length/2];
        } else {
            newArr = new int[arr.length/2+1];
        }

        for (int i = 0, j = 0; i < arr.length-1; i+=2,j++) {

            if (arr.length % 2 == 0) {
                newArr[j] = arr[i] + arr[i + 1];
            }else {
                newArr[j] = arr[i] + arr[i + 1];
                newArr[newArr.length-1] = arr[arr.length-1];
            }
        }

        System.out.println(Arrays.toString(newArr));


    }
}
/*
/. Write a program that collapses a list of integers by replacing each successive pair of integers with the sum of the pair.
For example, if a variable called list stores this sequence of values:
[7, 2, 8, 9, 4, 13, 7, 1, 9, 10]The first pair should be collapsed into 9 (7 + 2), the second pair should be collapsed
into 17 (8 + 9), the third pair should be collapsed into 17 (4 + 13) and so on to yield:
[9, 17, 17, 8, 19]If the list stores an odd number of elements, the final element is not collapsed.
For example, the sequence:        [1, 2, 3, 4, 5]would collapse into:        [3, 7, 5]/
 */