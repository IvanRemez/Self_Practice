package CodingWithMosh.Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class StackWith2Queues {

    Queue<Integer> queue1 = new ArrayDeque<>();
    Queue<Integer> queue2 = new ArrayDeque<>();
    private int top;

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
    }

// O(1)
    public void push(int item) {
        queue1.add(item);
        top = item;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        while (queue1.size() > 1) {
            top = queue1.remove();
            queue2.add(top);
        }
        swapQueues();

        return queue2.remove();
    }

    public int peek() {

        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return top;
    }

    private void swapQueues() {
        var temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }


// O(1)
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

// O(1)
    public int size() {
        return queue1.size();
    }

}
