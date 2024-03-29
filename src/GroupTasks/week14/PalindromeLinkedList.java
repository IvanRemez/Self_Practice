package GroupTasks.week14;
/*
Question-2 Palindrome Linked List

Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
Example 1:
Input: head = [1, 2, 2, 1] Output: true
Example 2:
Input: head = [1, 2] Output: false

Constraints:
• The number of nodes in the list is in the range [1, 10^5].
• 0 <= Node.val <= 9
Follow up: Could you do it in O(n) time and O(1) space?

Please, try to test your solution via JUnit and also test your solution here:
https://leetcode.com/problems/palindrome-linked-list/
 */

public class PalindromeLinkedList {

    public static void main(String[] args) {

        // TEST HERE

        LinkedListApp list = new LinkedListApp();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);

        System.out.println(list.isPalindrome(list.head)); // true

        LinkedListApp list2 = new LinkedListApp();
        list2.add(1);
        list2.add(2);
        System.out.println(list2.isPalindrome(list2.head)); // false

    }

    // SOLUTIONS HERE

}
