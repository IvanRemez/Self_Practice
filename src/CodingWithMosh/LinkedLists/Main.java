package CodingWithMosh.LinkedLists;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        var list = new LinkedList();
        System.out.println(list.size());    // 0
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.addFirst(30);
        list.printNodes(); // 30 -> 10 -> 20 -> 30 -> null

        list.deleteFirst();
        list.printNodes(); // 10 -> 20 -> 30 -> null

        list.deleteLast();
        list.printNodes(); // 10 -> 20 -> null

        System.out.println(list.indexOf(30)); // -1
        System.out.println(list.contains(10)); // true
        System.out.println(list.contains(30)); // false

        System.out.println(list.size());    // 2

        var array = list.toArray();
        System.out.println(Arrays.toString(array));

    }
}
