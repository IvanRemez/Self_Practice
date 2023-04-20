package GroupTasks.week14;
/*
Question-1 Find All Elements Greater Than Their Right

Given an unsorted integer array, return all greater elements than all elements present to their right using Stack.
Example:
Input: [10, 4, 6, 3, 5]
Output: [10, 6, 5]
The elements that are greater than all elements to their right are 10, 6, and 5. 10>4 & 10>6 & 10>3 & 10>5

class Main{
// Function to print all elements which are greater than all
// elements present to their right
public List<Integer> find(int[] arr){
    }
}
Please, try to test your solution via JUnit.
 */

import java.util.List;
import java.util.Stack;

public class ElementsGreaterThanTheirRight {

    public static void main(String[] args) {

        // TEST HERE
        int[] arr = {10, 4, 6, 3, 5};
        int[] arr2 = {2, 4, 6, 3};
        int[] arr3 = {2, 4, 6};

        System.out.println(find_Ivan(arr)); // [10, 6, 5]
        System.out.println(find_Ivan(arr2));
        System.out.println(find_Ivan(arr3));

    }

    // SOLUTIONS HERE

    public static Stack<Integer> find_Ivan(int[] arr) {

        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
        }
        Stack<Integer> stack = new Stack<>();

        for (int each: arr) {

            while (!stack.isEmpty() && stack.peek() < each) {
                stack.pop();
            }
            stack.push(each);
        }
        return stack;
    }
}
