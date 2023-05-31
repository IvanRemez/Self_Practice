package CodingWithMosh.Arrays;

public class Array {

    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {

        resizeIfRequired();   // our private method

        items[count] = item;  // count = # of items in array
        // -> count # as index is next empty space
        count++;  // increase count by 1 after insertion
    }

    private void resizeIfRequired() {
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
    }

    public void removeAt(int index) {
        // Validate the index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        // Shift items to the left to fill empty space
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;  // decrease # of items in array by 1
    }

    public int indexOf(int item) {
        // iterate and return index of item
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        // otherwise, return -1
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

// EXTRA EXERCISES:

    public int max() {

        int max = 0;

        for (int each : items) {    // O(n) time - worst case
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public void reverse() {

        int[] reversedArray = new int[count];   // count = items.length

        for (int i = 0; i < count; i++)
            reversedArray[i] = items[count - i - 1];

        items = reversedArray;
    }

    public void insertAt(int item, int index) {

        if (index < 0 || index > count)
            throw new IllegalArgumentException();

        resizeIfRequired();

        for (int i = count - 1; i >= index; i--)
            items[i + 1] = items[i];          // shift over elements to the right of insertion

        items[index] = item;    // insert item
        count++;    // increase item count by 1
    }

    public Array intersect(Array otherArr) {

        var commonArr = new Array(count);

        for (int item : items) {    // loop through the 1st Array items

            if (otherArr.indexOf(item) >= 0) {  // if 2nd Array contains the same item
                commonArr.insert(item);         // its index will be >= 0
                    // if same item -> add to common Array
            }
        }
        return commonArr;
    }

}
