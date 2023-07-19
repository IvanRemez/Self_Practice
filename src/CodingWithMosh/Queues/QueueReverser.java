package CodingWithMosh.Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueReverser {

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(queue);
        reverse(queue, 3);
        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> queue, int k) {

        if (k < 0 || k > queue.size())
            throw new IllegalArgumentException();

        Stack<Integer> stack = new Stack<>();

    // dequeue 1st K elements onto Stack:
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }
    // enqueue elements from Stack into BACK of queue:
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    // add remaining elements to back of the queue:
        for (int i = k; i < queue.size(); i++) {
            queue.add(queue.remove());
        }
    }
}
