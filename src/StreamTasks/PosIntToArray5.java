package StreamTasks;

import java.util.Arrays;

public class PosIntToArray5 {

    public static void main(String[] args) {

        int N = 490;

        int[] nums = Integer.toString(N).chars()
                .map(c -> c - '0').toArray();

        for (int n : nums)
            System.out.print(n);
        System.out.println();

        System.out.println("--------------------------------");

        int num = 490;

        String s = Integer.toString(num);

        int[] intArray = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            intArray[i] = Character.getNumericValue(s.charAt(i));
        }
        System.out.println(Arrays.toString(intArray));

    }

/*    public static void intToIntArray(int N) {

        String temp = Integer.toString(N);
        int[] intArr = new int[temp.length()];

        for (int i = 0; i < temp.length(); i++)
        {
            intArr[i] = temp.charAt(i) - '0';
        }
    }

 */
}
/*
How to convert a positive int (N) to an array of digits
EXAMPLE:
Input: 490
Output: [4, 9, 0] (as int Array)
 */