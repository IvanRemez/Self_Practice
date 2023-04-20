package Replits.Arrays;
import java.util.Scanner;

public class NonDuplicate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

//        for (int i = 0, j = 1; i < nums.length; i++, j++) {
//
//            int frequency = 0;
//
//            if (nums[i] == nums[j]) {
//                frequency++;
//            }
//            if (frequency == 1) {
//                System.out.println(nums[i]);
//                break;
//            }
//        }

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(nums[i]);
            }
        }
    }
}
