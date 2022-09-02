package oops;

import java.util.Scanner;
import java.util.Stack;

public class Userdefine {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //(), [],{}

        System.out.println("Enter The Expression");
        String expression = s.nextLine(); //"(a)*(b+c)";
        char[] chars = expression.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char ch : chars) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                continue;
            }
            if (ch == ')' || ch == '}' || ch == ']') {
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
        Stack<Integer> stackwa = new Stack<>();
        for (int i = 0; i <= chars.length - 1; i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
                stackwa.push(i);
                continue;
            }
            if (chars[i] == ')' || chars[i] == '}' || chars[i] == ']') {
                int start = stackwa.pop();
                int end = i;
                //System.out.println();
                for (int j = start; j <= end; j++) {
                    System.out.print(chars[j]);
                }
                System.out.println();
            }
        }

//*******************************************************************
    }
}
