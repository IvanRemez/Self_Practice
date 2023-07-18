package CodingWithMosh.LinkedLists;

import java.util.NoSuchElementException;

public class LinkedList {

    public class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    void printNodes() {

        Node current = first;
        while (current != null) {

            if (current.next == null) {
                System.out.println(current.value + " -> null");
            } else {
                System.out.print(current.value + " -> ");
            }
            current = current.next;
        }
    }

    boolean isEmpty() {
        return first == null;
    }

    private Node getPrevious(Node node) {

        var current = first;

        while (current != null) {
            if (current.next == node) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void addFirst(int item) {

        var node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public void addLast(int item) {

        var node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void deleteFirst() {

        if (isEmpty()) {
            throw new NoSuchElementException();
        } else if (first == last) {
            first = last = null;
        } else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public void deleteLast() {

        if (isEmpty()) {
            throw new NoSuchElementException();
        } else if (first == last) {
            first = last = null;
        } else {
            var prev = getPrevious(last);
            last = prev;
            last.next = null;
        }
        size--;
    }

    public int indexOf(int item) {

        var current = first;
        int index = 0;

        while (current != null) {
            if (current.value == item) {
                return index;
            } else {
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {

        int[] array = new int[size];

        var current = first;
        var index = 0;

        while (current != null) {
            array[index] = current.value;
            index++;
            current = current.next;
        }
        return array;
    }

    public void reverse() {

        if (isEmpty()) return;

        var current = first.next;   // assign pointers using first
        var prev = first;
        while (current != null) {

            var next = current.next;    // assign temp pointer
            current.next = prev;        // reverse link
            prev = current;             // shift pointers right ->
            current = next;
        }
        // Reassign last Node
        last = first;
        last.next = null;   // last link needs to point to null
        // reassign first Node
        first = prev;
    }

    public int getKthFromTheEnd(int k) {
        if (isEmpty()) {
            throw new IllegalStateException("Empty list.");
        }
        // pointers:
        var a = first;
        var b = first;
        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null) {
                throw new IllegalArgumentException("K larger than List size.");
            }
        }
        while (b != last) {
            a = a.next;
            b = b.next;
        }
        return a.value;
    }

    public void printMiddle() {
        if (isEmpty()) {
            throw new IllegalStateException("Empty list.");
        }
        // pointers:
        var a = first;
        var b = first;
        while (b != last && b.next != last) {
            b = b.next.next;
            a = a.next;
        }
        if (b == last) {
            System.out.println(a.value);
        } else {
            System.out.println(a.value + ", " + a.next.value);
        }
    }

    public boolean hasLoop() {
        // pointers:
        var slow = first;
        var fast = first;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
