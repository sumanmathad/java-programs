package LeetCode.Solutions.Problems_001_to_100;

import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

 */
public class _0020_ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("[()[]{}]"));
    }
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                char ch = stack.pop();
                if (c == ')' && ch == '(' || c == ']' && ch == '[' || c == '}' && ch == '{') continue;
                else return false;
            }
        }
        return stack.isEmpty();
    }


}
