package GroupTasks.week4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicatedChars {

    public static void main(String[] args) {

     //   String s = "aabbcde"
/*
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));

 */

        String input = "ddffgfgi";
        Map<Character,Long> charCount = input.chars().mapToObj(i->(char)i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        Optional<Character> firstNonRepeat = charCount.entrySet().stream()
                .filter(e->e.getValue()==1)
                .map(e-> e.getKey()).findFirst();


        Optional<Character>firstRepeatedElement = charCount.entrySet().stream()
                .filter(e->e.getValue()>1)
                .map(e->e.getKey()).findFirst();
        System.out.println("First Non-Repeated Character "+ firstNonRepeat.orElseThrow());
        System.out.println("First Repeated Character "+firstRepeatedElement.orElseThrow());

        System.out.println("-----------------------------------------------------------");

        String str = "ABBA";

        System.out.println(getNumber(str));

        System.out.println("-----------------------------------------------------------");



    }

    public static int getNumber(String str) {
        String[] ch = str.toLowerCase().split("");
        String newString = "";
        for (String each : ch) {    //compare each
            int counter = 0;
            for (String result : ch) {
                if (result.equals(each)) {
                    counter++;
                }
            }
            if (counter > 1 && !(newString.contains(each))) {
                newString += each;
            }
        }
        return newString.length();
    }

//System.out.println("-----------------------------------------------------------");

    public static int getNumber2(String str) {

        str = str.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch : str.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
            //map.put(ch, map.getOrDefault(ch, 0) + 1);
                    //                 ^^ get value of key ch, if doesn't exist, return 0
        }
        map.entrySet().removeIf(e -> e.getValue() == 1);
        return map.size();
    }
}
/*
Question-1 Count the number of Duplicated Chars

Write a function that will return the count of distinct case-insensitive alphabetic
characters and numeric digits that occur more than once in the input string.
The input string can be assumed to contain only alphabets (both uppercase and lowercase)
and numeric digits.

Example:

"abcde" -> 0 # no characters repeats more than once.
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times.
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice.
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice.
 */