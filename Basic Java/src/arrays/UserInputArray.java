package arrays;

import java.util.Scanner;

public class UserInputArray {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.err.println("Enter Array the size");
        int size = s.nextInt();
        int[] a = new int[size];
        for (int i = 0; i <= a.length - 1; i++) {
            System.err.println("Enter value");
            a[i] = s.nextInt();
        }
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + ",");
        }

        System.out.println();
        int product = 1;
        for(int i=0;i<=a.length-1;i++){
        
        product = product * a[i];
    }
        System.out.println(product);
}
}