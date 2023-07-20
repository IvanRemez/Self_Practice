package CodingWithMosh.HashTables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NonRepeatChar {

    public static void main(String[] args) {

    // find 1st non-repeated char:
        String str = "green apple";

        System.out.println(find1stNonRepeatingChar(str));   // g
        System.out.println(find1stRepeatedChar(str));       // e
    }

    public static char find1stNonRepeatingChar(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (var ch : str.toCharArray()) {

//            if (map.containsKey(ch)) {
//                var count = map.get(ch);
//                map.put(ch, count + 1);
//            } else {
//                map.put(ch, 1);
//            }
            var count = map.getOrDefault(ch, 0);
            map.put(ch, count + 1);
        }
        for (var ch : str.toCharArray()) {

            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return Character.MIN_VALUE;
    }

    public static char find1stRepeatedChar(String str) {

        Set<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (set.contains(ch)) {
                return ch;
            }
            set.add(ch);
        }
        return Character.MIN_VALUE;
    }
}
