package basics;


import java.util.Stack;

public class StackcheckBracket {

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        String expression = "(a+b))/((a-b+)*)((a*b*c)";
        expression = "(" + expression + ")";
        char[] chars = expression.toCharArray();
        for (int i = 0; i <= chars.length - 1; i++) {
            char ch = chars[i];
            if (ch == '(') {
                stack.push(i);

            }
            if (ch == ')') {
                if (stack.empty()) {
                    System.out.println("Invalid");
                    return;
                }
                stack.pop();
            }

        }
        if (stack.empty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

}
