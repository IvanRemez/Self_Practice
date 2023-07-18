package CodingWithMosh.Stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalanceExpression {

    private final List<Character> leftBrackets =
            Arrays.asList('(', '<', '[', '{');
    private final List<Character> rightBrackets =
            Arrays.asList(')', '>', ']', '}');

    public boolean isBalanced(String input) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

        // filter non player chars (wrong symbols)
            if (ch != '(' && ch != '[' && ch != '{' && ch != ')' && ch != ']' && ch != '}')
                continue;
        // if correct symbol:
        // if opening symbol -> push to Stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            if (stack.isEmpty()) {
                return false;
            }

            switch (ch) {
                case ')':
                    if (stack.pop() != '(') return false;
                    break;
                case ']':
                    if (stack.pop() != '[') return false;
                    break;
                case '}':
                    if (stack.pop() != '{') return false;
                    break;
            }
        }
        return stack.isEmpty();
    }

    public boolean isBalanced_Mosh(String input) {

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {

            if (isLeftBracket(ch))
                stack.push(ch);

            if (isRightBracket(ch)) {
                if (stack.empty()) return false;    // for reverse order brackets

                var top = stack.pop();
                if (!bracketsMatch(top, ch)

                ) return false;
            }
        }
        return stack.empty();
    }

    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }
    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }
    private boolean bracketsMatch(char left, char right) {

        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
