package CodingWithMosh.Queues;

import java.util.Arrays;

public class PriorityQueue {

    private int[] items = new int[5];
    private int count;

    public void add(int item) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        var i = shiftItemsToInsert(item);
        items[i] = item;
        count++;
    }

    public int shiftItemsToInsert(int item) {

        int i;      // need i (index) after for loop is done to insert new item

        for (i = count - 1; i >= 0; i--) {

            if (items[i] > item) {
                items[i + 1] = items[i];
            } else {
                break;
            }
        }
        return i + 1;
    }

    public int remove() {

        if (isEmpty()) {
            throw new IllegalStateException();
        }

        return items[--count];  // need to decrement 1st (count - 1 = index)
    }

    public boolean isFull() {
        return count == items.length;
    }
    public boolean isEmpty() {
        return count == 0;
    }
    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
