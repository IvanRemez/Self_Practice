package LeetCode.Beginner;

/*
392. Is Subsequence

Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false

Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.
 */

public class IsSubsequence {

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

