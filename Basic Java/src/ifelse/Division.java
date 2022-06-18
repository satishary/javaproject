package ifelse;

import java.util.Scanner;

public class Division {

    public static void main(String args[]) {
        int percent;
        Scanner s = new Scanner(System.in);
        percent = s.nextInt();
        if (percent < 40) {
            System.out.println("fail");
        } else if (percent < 50) {
            System.out.println("third division");

        } else if (percent < 60) {
            System.out.println("second division");

        } else {
            System.out.println("first division");
        }

    }

}
