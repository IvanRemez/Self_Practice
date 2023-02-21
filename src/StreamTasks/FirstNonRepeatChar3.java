package StreamTasks;

public class FirstNonRepeatChar3 {

    public static void main(String[] args) {

        String s = "success";

        nonRepeatChar(s);

    }

    public static void nonRepeatChar(String s) {

        for (int i = 0; i < s.length(); i++) {

            if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
/*
Write a function that returns the first non-repeated char from a String.
If all chars are repeated, return a space char
 */