package CodingWithMosh.Stacks;

import java.util.Arrays;

public class Stack {

    private int[] items = new int[5];
    private int count;      // used as index for the Array

    public void push(int item) {

        if (count == items.length) {        // if Array is full
            throw new StackOverflowError();
        }
        items[count] = item;
        count++;
    }

    public int pop() {

        if (count == 0) {                   // if Array is empty
            throw new IllegalStateException();
        }
        count--;
        return items[count];
    }

    public int peek() {
        if (count == 0) {                   // if Array is empty
            throw new IllegalStateException();
        }
        return items[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }
}
