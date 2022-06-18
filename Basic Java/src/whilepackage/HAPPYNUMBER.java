package whilepackage;

import java.util.Scanner;

public class HAPPYNUMBER {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = scan.nextInt();
        int happy = n, sum = 0;
        while (sum != n) {
            sum = 0;
            while (happy != 0) {
                int dig = happy % 10;
                sum += dig * dig;
                happy /= 10;
            }
            if (sum == n) {
                System.out.println("Unhappy Number");
            }
            if (sum == 1) {
                System.out.println(n + " is happy Number");
                break;
            }
            happy = sum;
        }
    }
}

