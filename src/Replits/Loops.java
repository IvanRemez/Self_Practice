package Replits;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {

                char each = str.charAt(j);

                if (ch == each){
                    frequency++;
                }
            }
            if (frequency == 3){
                count++;
            }
        }
        System.out.println(count);
    }
}
