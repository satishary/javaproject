package ifelse;

import java.util.Scanner;

public class CURRENCY {

    public static void main(String args[]) {
        int rupees, paisa;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rupees and paisa");

        rupees = s.nextInt();
        paisa = s.nextInt();
        int total=rupees*100 + paisa;
        System.out.println(total);
        rupees=total/100;
        paisa=total%100;
        System.out.print("₹");
        System.out.print(rupees);
        System.out.print(".");
        System.out.println(paisa);
    }

}
