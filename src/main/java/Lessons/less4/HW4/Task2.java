package Lessons.less4.HW4;

import java.util.Stack;

public class Task2 {
    public static void main(String[] args) {
        validChars check = new validChars();
        System.out.println(check.isValid("()"));
        System.out.println(check.isValid("()[]{}"));
        System.out.println(check.isValid("(]"));
    }

}
class validChars {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }
                if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
