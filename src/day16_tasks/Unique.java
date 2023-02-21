package day16_tasks;

public class Unique {

    public static void main(String[] args) {

        String str = "aabccdeef";
        String unique = ""; // to store unique chars

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i); // 'a'
            int count = 0; // frequency of the ch

            for (int j = 0; j < str.length(); j++) {

                char each = str.charAt(j);

                if (ch == each){
                    count++;
                }
            }
/*
            if(count == 1){ // if the frequency of the character is 1, then the character is unique
                result += ch;
            }

 */
            if (count != 1){
                continue;
            }
            unique += ch;
        }
        System.out.println(unique);

    }
}
/*
10. Write a program that can find the unique characters from a string without using
index() and lastIndexOf() methods

                        Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then
            you can repeat it for the remaining characters to find the frequency.

                        if frequency of a character == 1  =========> unique

 */