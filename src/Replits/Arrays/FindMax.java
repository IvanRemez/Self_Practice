package Replits.Arrays;
import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int max = 0;

        for (int each : nums) {

            if (each > max) {
                max = each;
            }
        }
        System.out.println(max);
    }
}
