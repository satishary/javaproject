package oops;

import java.util.Scanner;
import java.util.Stack;

public class Stackmenuq {

    public static void main(String[] args) {
        //  int In;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Stack Number");

        Stack<Integer> stack = new Stack<>();   
        while (true) {
            System.out.println("0-Exit, 1-In, 2-Out, 3-View");
            int option = Integer.parseInt(s.nextLine());
            switch (option) {
                case 1: {
                    System.out.println("Enter number");
                    int n = Integer.parseInt(s.nextLine());
                    stack.push(n);
                    System.out.println(stack);
                    break;
                }
                case 2: {
                    System.out.println("Out");
                    if (!stack.empty());  {
                       
                        int n = stack.pop();
                        System.out.println(n);
                    }
                        break;

                    }
                case 3: {
                    System.out.println("View");
                    System.out.println(option);
                 
                 
                }
                case 0: {
                    System.out.println(stack);
                    System.out.println("Exit");

                    return;
                }
            }

        }
    }

}
