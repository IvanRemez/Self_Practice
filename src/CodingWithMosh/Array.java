package CodingWithMosh;

import java.util.Arrays;

public class Array {

    private int[] items;
    private int count;  // # of items in our Array

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
    // if array is full, resize it
        if (items.length == count) {
    // create new Array (twice the size)
            int[] newItems = new int[count * 2];
    // copy all existing items
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
    // set "items" to new array
            items = newItems;
        }
    // add new item at the end (count # as index will be the next empty space due to index starting at 0)
        items[count] = item;
        count++;
    }

    public void removeAt(int index) {
    // validate the index (-1)
        if (index < 0 || index >= count) {
            // if count is 4, last index is 3 -> no items above index 3
            throw new IllegalArgumentException();
        }
    // shift items to the left to fill the empty space after removal
        // ex. [10, 20, 30, 40]
        // remove index 1 (20) -> have to shift 30 and 40 to the left
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item) {
    // loop over array to find item, return index
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return i;
            }
        }
    // otherwise, return -1
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

}
