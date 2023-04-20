package Replits.Arrays;
import java.util.Scanner;

public class FirstAndLastChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for (String each : words) {

            System.out.println("" + each.charAt(0) + each.charAt(each.length() - 1));
        }

    }
}
