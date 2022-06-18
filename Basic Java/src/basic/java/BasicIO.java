package basic.java;

import java.util.Scanner;

public class BasicIO {
    public static void main(String[] args) {
        //Program to add 2 numbers
        int a,b;
        Scanner s=new Scanner(System.in);//Scanner is used for reading input
        System.out.println("Enter a and b");
        a=s.nextInt();
        b=s.nextInt();
        int sum=a+b;
        System.out.println(sum);
        // +, -, *, / , %
    }
}
