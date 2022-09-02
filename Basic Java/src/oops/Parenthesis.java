package oops;

import java.util.Stack;

public class Parenthesis {

    public static void main(String[] args) {
        String expression = "(a)*(b+c)";
        char[] chars = expression.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char ch : chars) {
            if (ch == '(') {
                stack.push(ch);
                continue;
            }
            if (ch == ')') {
                if (stack.empty()) {
                    System.out.println("Error");
                    return;
                }
                stack.pop();

            }
        }
        if (!stack.empty()) {
            System.out.println("Error");
            return;
        }
        System.out.println("Correct");
//*******************************************************************

//*******************************************************************
        
        
    }
}
