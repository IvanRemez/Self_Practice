package PairTasks;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThiefFox {

    /**
     * We have a fox group consists of 4 foxes. Unfortunately one of them stole an egg from chicken barn.
     * Luckily guard rooster have some info to identify the guilty fox.
     * Sheriff Dog got the info from the rooster. Sheriff Dog announced that;
     * thief fox had a black coat, a torch and 3 bags.
     * Find the suspect foxes, if a fox is cleared of charges write that also
     */

// CHECK VALUE WHEN USING SETTER:
    private int age;

    public void setAge(int age) throws Exception{

        if (age >= 21){
            this.age = age;
        } else {
            throw new Exception ("Age must be 21 or above");
        }
    }   // if NO Setter Method -> can include restriction for setting variable INSIDE the Constructor

// ThiefFox TASK:

    public static void main(String[] args) {
        boolean fox1WearsCoat = true;
        boolean fox2WearsCoat = true;
        boolean fox3WearsCoat = true;
        boolean fox4WearsCoat = false;

        boolean fox1HasATorch = true;
        boolean fox2HasATorch = true;
        boolean fox3HasATorch = true;
        boolean fox4HasATorch = true;

        String fox1CoatColor = "BLACK";
        String fox2CoatColor = "BLACK";
        String fox3CoatColor = "BLACK";
        String fox4CoatColor = "GRAY";

        int fox1BagCount = 0;
        int fox2BagCount = 2;
        int fox3BagCount = 3;
        int fox4BagCount = 3;

        // fox 3 did it

        boolean fox1IsThief = false,
                fox2IsThief = false,
                fox3IsThief = false,
                fox4IsThief = false;

        if (fox1WearsCoat && fox1HasATorch && fox1CoatColor.equals("BLACK") && fox1BagCount == 3){
            fox1IsThief = true;
        } else if (fox2WearsCoat && fox2HasATorch && fox2CoatColor.equals("BLACK") && fox2BagCount == 3){
            fox2IsThief = true;
        } else if (fox3WearsCoat && fox3HasATorch && fox3CoatColor.equals("BLACK") && fox3BagCount == 3){
            fox3IsThief = true;
        }else {
            fox4IsThief = true;
        }
        System.out.println("fox1IsThief = " + fox1IsThief);
        System.out.println("fox2IsThief = " + fox2IsThief);
        System.out.println("fox3IsThief = " + fox3IsThief);     // TRUE
        System.out.println("fox4IsThief = " + fox4IsThief);


        // boolean[] coatArray = new {

// How to access the file (like a file named DJRUtilities.class) of a class in Intellij?
        // DJRUtilities ??

    // DIVIDE BY ZERO EXCEPTION:

        int x = 10;

        try{
            System.out.println(x/0);
        } catch (ArithmeticException e){
            e.printStackTrace();
        }

    // PRINT EMOJIS -> Shortcut = Control + Command + Space

        System.out.println("😁 😎 🫥 👍 🦾 ");
        System.out.println("\uD83E\uDD8A");

    // Write a program to play beep sound:

        Toolkit.getDefaultToolkit().beep();

    // Write a code that throws NullPointerException:

        String str = null;

        try{
            System.out.println(str.length());
        } catch (NullPointerException e){
            e.printStackTrace();
        }

        System.out.println("-----------------------------------------");

    // Write a code that performs Autoboxing:

        Integer num = 1;
        System.out.println(num);

    // Write a code that performs Unboxing:

        int a = num;

        System.out.println(a);

    //Task: CapitalizeAllWordsInAString
        //Given a string, write a method that capitalizes the first chars of each word and returns the new string.
        //
        //Example:
        //Input: “How can mirrors be real if our eyes aren't real”
        //Output: “How Can Mirrors Be Real If Our Eyes Aren't Real”

        String str1 = "How can mirrors be real if our eyes aren't real";
        String result = "";

        String[] words = str1.split(" ");

        System.out.println(Arrays.toString(words));

        for (String eachWord : words) {

            result += (" " + eachWord.charAt(0)).toUpperCase() + eachWord.substring(1);
        }
        System.out.println(result.trim());

    //Task: ManipulateArray
        //Given a String array
        //String[] myArray = new String[3];
        //Assign “I am a DJR” to all elements of this array In a FOR EACH loop

        String[] myArray = new String[3];

        ArrayList<String> newList = new ArrayList<>();

        for (String eachElement : newList) {

            eachElement += "I am a DJR";
        }

        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = "I am a DJR";
        }
        System.out.println(Arrays.toString(myArray));

        System.out.println(newList);

    }
}
