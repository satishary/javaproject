package ifelse;

import java.util.Scanner;

public class WeekDay {

    public static void main(String args[]) {
        int week;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");

        week = s.nextInt();
        if (week == 1) {
            System.out.println("SUNDAY");

        } else if (week == 2) {
            System.out.println("MONDAY");
        } else if (week == 3) {
            System.out.println("TUESDAY");
        } else if (week == 4) {
            System.out.println("WEDNESDAY");
        } else if (week == 5) {
            System.out.println("THUSDAY");
        } else if (week == 6) {
            System.out.println("FRIDAY");
        } else if (week == 7) {
            System.out.println("SATURDAY");
        } else if (week == 8) {
            System.out.println("INVALID");
        }

    }

}
