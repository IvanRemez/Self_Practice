package CodingWithMosh;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    private boolean isEmpty() {
        return first == null;
    }

// addFirst()
    public void addFirst(int item) {

        var node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }
// addLast()
    public void addLast(int item) {

        var node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }
// indexOf()
    public int indexOf(int item) {

        int index = 0; // no indexes in LL so create our own
        var current = first;

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
// contains()
    public boolean contains(int item) {

        return indexOf(item) != -1; // using indexOf() as a shortcut
        // if index isn't -1, our list contains the item
    }
// removeFirst()
    public void removeFirst() {

        if (isEmpty()) {            // empty list case
            throw new NoSuchElementException();
        }
        if (first == last) {        // 1 element case
            first = last = null;
            return;
        }
        var second = first.next;
        first.next = null;
        first = second;
    }
// removeLast()
    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {        // 1 element case
            first = last = null;
            return;
        }
        var current = first;
        while (current.next.next != null) {
            current = current.next;
        }
        last = current;
        current.next = null;
    }

}
