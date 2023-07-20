package LeetCode.Beginner;

import java.util.ArrayList;

public class IsSubsequence2 {

    public static void main(String[] args) {

        String s = "abc";
        String t = "ahbgdcg";

        System.out.println(isSubsequence(s, t));
        System.out.println(isSubsequence2(s, t));


    }

    public static boolean isSubsequence(String s, String t) {

        if (s.isEmpty()) {
            return true;
        }

        int count = 0;
        String result = "";

        for (int i = 0; i < t.length(); i++) {

            if (s.charAt(count) == t.charAt(i)) {
                result += s.charAt(count);
                count++;
                if ((s.length()) == count) {
                    return result.equals(s);
                }
            }
        }
        return false;
    }

    private static int index = -1;
    public static boolean isSubsequence2(String s, String t) {

        for (int i = 0; i < s.length(); i++) {
            index = t.indexOf(s.charAt(i), index + 1);
            if (index == -1) {
                return false;
            }
        }
        return true;
    }
}

