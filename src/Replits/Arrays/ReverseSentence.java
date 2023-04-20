package Replits.Arrays;
import java.util.Scanner;

public class ReverseSentence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] strArray = sentence.split(" ");

        String reversedSentence = "";

        for (int i = strArray.length - 1; i >= 0 ; i--) {

            reversedSentence += strArray[i] + " ";
        }
        System.out.println(reversedSentence.trim());

    }
}
