package CodingWithMosh.Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Demos {

    public static void main(String[] args) {

        // Vector: grows by 100%(x2) when full + Synchronized
        // ArrayList: grows by 50%(x1.5) when full - NOT Synchronized

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.remove(0); // 10
        System.out.println(arrayList.indexOf(20));   // 0
        System.out.println(arrayList.contains(20));  // true
        System.out.println(arrayList.size());        // 2
        System.out.println(arrayList);
        System.out.println("------------------------------------");

        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.addFirst(5);
        linkedList.removeFirst();
        System.out.println(linkedList.contains(10));    // true
        System.out.println(linkedList.indexOf(10));     // 0
        System.out.println(linkedList.size());          // 3
        System.out.println(linkedList);
        var array = linkedList.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("------------------------------------");

        var list1 = new CodingWithMosh.Intro.LinkedList();
        list1.addLast(10);
        list1.addLast(20);
        list1.addLast(30);
        System.out.println(list1.indexOf(10));  // 0
        System.out.println(list1.indexOf(30));  // 2
        System.out.println(list1.indexOf(40));  // -1
        System.out.println("------------------------------------");
        System.out.println(list1.contains(40)); // false
        System.out.println(list1.contains(10)); // true
        list1.removeFirst();
        System.out.println(list1.contains(10)); // false
        list1.removeLast();
        System.out.println(list1.contains(30)); // false
    }
}
