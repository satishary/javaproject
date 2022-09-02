package ifelse;

import java.util.Scanner;

public class Divisibility {

    public static void main(String args[]) {
        int num, dem;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");

        num = s.nextInt();
        dem = s.nextInt();
        if (num % dem == 0) {
            System.out.println("no. is divisible");
        } else {
            System.out.println("no.is not divisible");
        }

    }

}
