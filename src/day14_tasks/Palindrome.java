package day14_tasks;

public class Palindrome {

    public static void main(String[] args) {

        String str = "Java";

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) { // reverse the string starting from ending index

            result += str.charAt(i);    // add chars in reverse order
        }

        boolean isPalindrome = str.equalsIgnoreCase(result);

        System.out.println(isPalindrome);

    }
}
/*
7. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */