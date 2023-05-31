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

    void printNodes () {

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
}
