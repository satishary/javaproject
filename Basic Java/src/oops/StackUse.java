package oops;

import java.util.Stack;
//Queue
public class StackUse {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int n = 10;
        for (int i = 1; i <= n; i++) {
            stack.push(i);
        }
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
