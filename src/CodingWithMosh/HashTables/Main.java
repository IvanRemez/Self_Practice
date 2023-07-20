package CodingWithMosh.HashTables;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(123456, "Mosh");
    // items[1] = "Mosh"
    // size of Array: 100
        // indices: 0 - 99
        // need Hash function to store unique key in one of the indices
        // use Modulus operator %

        System.out.println(hash(123456));   // index = 56

        Map<String, String> map2 = new HashMap<>();

        map2.put("123456-A", "Mosh");
        System.out.println(hash("123456-A"));

        String str = "orange";
        System.out.println(str.hashCode());     // hashing example
    }

    public static int hash(int num) {
        return num % 100;
    }

    public static int hash(String key) {
        int hash = 0;
        for (char ch : key.toCharArray()) {
            hash += ch;     // implicit casting from char to int
                                // returns int value of the char
        }
        return hash % 100;
    }
}
