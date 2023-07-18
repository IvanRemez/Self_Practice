package Replits.Methods;

import java.util.Scanner;

public class UniqueChars {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));

    }

    public static String uniqueChars(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)) {
                result += each;
            }
        }
        return result;
    }
}
