package ifelse;

import java.util.Scanner;

public class threemaxuser {

    public static void main(String args[]) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        int max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("max" + max );

        int min;
        if (a <= b && a <= c) {
            min = a;
        } else if (b <= c) {
            min = b;
        } else {
            min = c;
        }
        System.out.println("min" + min );
    }

}
