package CodingWithMosh.Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        reverse(queue);
        System.out.println(queue);
        System.out.println("---------------------------------");

        ArrayQueue queue1 = new ArrayQueue(5);
        queue1.enqueue(10);
        queue1.enqueue(20);
        queue1.enqueue(30);
        System.out.println(queue1);
        queue1.dequeue();
        var front = queue1.dequeue();
        queue1.enqueue(40);
        queue1.enqueue(50);
        queue1.enqueue(60);
        queue1.enqueue(70);
        queue1.dequeue();
        queue1.enqueue(80);
        System.out.println(front);
        System.out.println(queue1);
        System.out.println("---------------------------------");

        QueueWith2Stacks queue2 = new QueueWith2Stacks();
        queue2.enqueue(10);
        queue2.enqueue(20);
        queue2.enqueue(30);
        var first = queue2.dequeue();
        System.out.println(first);      // 10
        System.out.println("---------------------------------");

        PriorityQueue queue3 = new PriorityQueue();
        queue3.add(5);
        queue3.add(3);
        queue3.add(6);
        queue3.add(1);
        queue3.add(4);
        System.out.println(queue3);

        while (!queue3.isEmpty()) {
            System.out.println(queue3.remove());
        }



    }

// Reverse Queue:
    // can only use add(), remove(), and isEmpty()
    public static void reverse(Queue<Integer> queue) {

        if (queue.isEmpty()) {
            throw new IllegalStateException();
        }
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

    }
}
