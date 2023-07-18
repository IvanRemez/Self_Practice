package CodingWithMosh.Stacks;

import CodingWithMosh.Stacks.Solutions.Expression;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        var top = stack.pop();      // removes item
        System.out.println(top);
        System.out.println(stack);

        top = stack.peek();         // keeps item
        System.out.println(top);

        String str = "abc";

        ReverseString reverser = new ReverseString();
        var result = reverser.reverse(str);

        System.out.println(result);

// balance expressions (ex. brackets)
        // Edge cases:
            // (
            // (()
            // ( ]
            // ) (

        String str1 = "(1 + 2)";

        BalanceExpression exp = new BalanceExpression();
        System.out.println(exp.isBalanced(str1));
        System.out.println(exp.isBalanced_Mosh(str1));

        CodingWithMosh.Stacks.Stack stack1 = new CodingWithMosh.Stacks.Stack();

        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        System.out.println(stack1);
        stack1.pop();
        System.out.println(stack1);
        System.out.println(stack1.peek());

    }
}
