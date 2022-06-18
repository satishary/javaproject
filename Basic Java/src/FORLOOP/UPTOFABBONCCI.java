package FORLOOP;

import java.util.Scanner;

public class UPTOFABBONCCI {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = 0, b = 1, c;
        int n = 99;
        for (int i = 0;; i++) {
            c = a + b;
            a = b;
            b = c;
            //System.out.println(c);
            if (c >= n) {
                if (c == n) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                return;
            }

        }
    }
}
