package CodingWithMosh.Queues;

import CodingWithMosh.Queues.Solutions.LinkedListQueue;

import java.util.ArrayList;

public class LLQueue {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int count;

// O(1)
    public void enqueue(int item) {

        var node = new Node(item);

        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        count++;
    }
// O(1)
    public int dequeue() {

        if (isEmpty()) {
            throw new IllegalStateException();
        }
        int value;
        if (head == tail) {
            value = head.value;
            head = tail = null;
        } else {
            value = head.value;
            var temp = head.next;
            head.next = null;
            head = temp;
        }
        count--;
        return value;
    }
// O(1)
    public int peek() {

        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return head.value;
    }
    public int size() {
        return count;
    }
    public boolean isEmpty() {

        return head == null;
    }
// O(n)
    public String toString() {
        ArrayList<Integer> list = new ArrayList<>();

        Node current = head;
        while (current != null) {
            list.add(current.value);
            current = current.next;
        }

        return list.toString();
    }
}
