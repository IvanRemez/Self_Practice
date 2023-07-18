package day20_tasks;

public class ReverseSecond {

    public static void main(String[] args) {

        String sentence = "I Love Java";

        String[] splitSent = sentence.split(" ");
        // String array created by splitting sentence by spaces in between words
        // "I, Love, Java"
        //  0    1    2
        
        String result = "";

        for (int i = 0; i < splitSent.length; i++) { // index: 0 - 2

            if (i == 1){ // element at index 1 = "Love"
                String word = splitSent[i]; // element Love assigned to word variable

                for (int j = word.length() - 1; j >= 0 ; j--) {
                    // "Love" word iterated backwards and each letter added to the result
                    result += word.charAt(j);
                }
                result += " "; // " " after evoL added
            }else {     // else block execution for index 0 (I), and index 2 (Java)
                result += splitSent[i] + " "; // I + " " added, then Java + " " added
            }
        }
        System.out.println(result);


    }
}
/*
1. Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */