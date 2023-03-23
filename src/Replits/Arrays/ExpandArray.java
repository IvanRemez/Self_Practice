package Replits.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExpandArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i =0; i < 3; i++) {
            nums[i] = scan.nextInt();
        }

        int[] nums2 = new int[6];

        for (int i = 0, j = 0; i < nums.length; i++, j++) {

            nums2[j] = nums[i];
        }
        System.out.println(Arrays.toString(nums2));
    }
}
