package  ifelse;

import java.util.Scanner;

public class MiddleNumber {

    public static void main(String args[]) {
        int a, b, c, middle;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if (a >= b && a <= c || a >= c && a <= b) {
            middle = a;
        } else if (b >= a && b <= c || b >= c && b <= c) {
            middle = b;

        } else {
            middle = c;
        }
        System.out.println("middle" + middle);
    }

}
