package oops;

import java.util.Scanner;
import java.util.Stack;

public class Demo {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String expression =s.nextLine();// "(1*2 + 3*(6+7)-9)";
        char[] chars = expression.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= chars.length - 1; i++) {
            if (chars[i] == '(') {
                stack.push(i);
                continue;
            }
            if (chars[i] == ')') {
                int start = stack.pop();
                int end = i;
                //System.out.println();
                for (int j = start; j <= end; j++) {
                    System.out.print(chars[j]);
                }
                System.out.println();
            }
        }

    }
}
