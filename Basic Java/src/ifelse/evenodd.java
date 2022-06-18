package ifelse;

import java.util.Scanner;

public class evenodd {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n;
        n = s.nextInt();
        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}
