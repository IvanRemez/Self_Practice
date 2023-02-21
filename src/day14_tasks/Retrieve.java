package day14_tasks;

public class Retrieve {

    public static void main(String[] args) {

        String str = "mn@#123Ab!";

        String digits = ""; // to contain all digits
        String letters = ""; // to contain all letters
        String specialChars = ""; // to contain all special chars

        for (int i = 0; i < str.length(); i++) { // str.length() gives max index #

            char ch = str.charAt(i);    // checks char at each index #

            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                letters += ch;
            } else {
                if (ch != ' ') {     // any other char besides empty space
                    specialChars += ch;
                }
            }

        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);

    }
}
/*
5. write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */