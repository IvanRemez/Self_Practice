package LeetCode.Beginner;
/*
205. Isomorphic Strings

Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true

Constraints:

1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.
 */

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static void main(String[] args) {

        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s, t));

    }

    public static boolean isIsomorphic(String s, String t) {

        if (s == null || t == null) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char char_s = s.charAt(i);
            char char_t = t.charAt(i);

            if (map.containsKey(char_s)) {
                if (map.get(char_s) != char_t) {
                    return false;
                }
            } else {
                if (map.containsValue(char_t)) {
                    return false;
                }
                map.put(char_s, char_t);
            }
        }
        return true;
    }

}
