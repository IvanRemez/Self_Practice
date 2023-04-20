package Replits.Arrays;
import java.util.Scanner;

public class ShortestWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] strArr = str.split(", ");
        int shortestLength = strArr[0].length();

        for (int i = 1; i < strArr.length; i++) {

            String[] result = new String[strArr.length];

            if (strArr[i].length() < shortestLength) {
                shortestLength = strArr[i].length();
            }
            if (strArr[i].length() == shortestLength) {
//                result.
            }
        }
    }
}
