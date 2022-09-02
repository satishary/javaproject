package ifelse;

import java.util.Scanner;

public class Quadratic {

    public static void main(String args[]) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("No Equation");
            return;
        }
        if (a == 0) {
            System.out.println("Answer = " + (-c / b));
            return;
        }
        double d = b * b - 4 * a * c;
        if (d >= 0) {
            d = Math.sqrt(d);
            double x1 = (b * b - d) / (2 * a);
            double x2 = (b * b + d) / (2 * a);
            System.out.printf("X1=%s, X2 = %s\n", x1, x2);
            return;
        } else {
            d = Math.sqrt(-d);
            double realpart = -b / (2 * a);
            double imaginarypart = d / (2 * a);
            System.out.printf("Real=%s, Imaginary = %s\n", realpart, imaginarypart);

        }
    }
}
