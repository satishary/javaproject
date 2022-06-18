package ifelse;

import java.util.Scanner;

public class Triangle {

    public static void main(String args[]) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if (a + b < c || b + c < a || c + a < b) {
            System.out.println("Triangle is not possible");
            return;
        }
        System.out.println("Triangle is  possible");

        if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        } else if (a == b || b == a || c == a) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalen triangle");

            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("Right angle triangle");
            }

        }
    }
}
