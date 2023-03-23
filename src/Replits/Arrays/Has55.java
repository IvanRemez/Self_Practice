package Replits.Arrays;

import java.util.Scanner;

public class Has55 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        boolean has55 = false;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 5 && nums[++i] == 5) {
                has55 = true;
            }else {
                has55 = false;
            }
        }
        System.out.println(has55);
//  [5, 5, x, x, x] edge case DOESN'T WORK
    }
}
