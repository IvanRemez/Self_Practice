package day20_tasks;

public class Palindromes {

    public static void main(String[] args) {

        String[] arr = {"anna", "level", "Java"};

        int count = 0;

        for (String word : arr) {

            String reverse = "";

            for (int i = word.length()-1; i >= 0 ; i--) {

                reverse += word.charAt(i);
            }

            if (word.equalsIgnoreCase(reverse)){
                count++;
            }
        }
        System.out.println(count);

    }
}
/*
4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */