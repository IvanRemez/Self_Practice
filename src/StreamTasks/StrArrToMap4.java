package StreamTasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StrArrToMap4 {

    public static void main(String[] args) {

        String[] arr = {"Apple", "Banana", "apple", "Cherry", "Apple"};

        System.out.println(solutionWithStream(arr));
    }

    private static Map<String, Integer> solutionWithStream(String[] testArray){
        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(testArray) // Streaming over testArray
                .distinct() // Stream is working on the distinct elements of the testArray
                .forEach( // performs the below code for each element of the testArray
                        e -> map.put(e, (int)Arrays.stream(testArray).filter( p -> p.equals(e)).count()));
// put method adds all unique elements of the testArray one by one with their occurrence counts.
        return map;
    }

}
/*
Write a function that takes a String array as parameter, and returns a map object that contains each
element of array as key and their occurrence counts as value.
- For calculating occurrence, array elements should be checked by regarding their case sensitivity
- Order is not important

EXAMPLE:
Input: {"Apple", "Banana", "apple", "Cherry", "Apple"}
Output: returning map elements:
        {apple=1, Apple=2, Cherry=1, Banana=1}
 */