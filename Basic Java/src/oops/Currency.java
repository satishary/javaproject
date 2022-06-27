package oops;

import java.util.Scanner;

/**
 *
 * rupee, paise
 */
public class Currency {

    int rupee, paisa;

    public Currency(int rupee, int paisa) {
        this.rupee = rupee;
        this.paisa = paisa;
    }

    public Currency() {
        System.out.println("Enter the Rupee and Paisa");
        Scanner s = new Scanner(System.in);
        rupee = Integer.parseInt(s.nextLine());
        paisa = Integer.parseInt(s.nextLine());
    }

    public String toString() {
        return "Rupee=" + rupee + "paisa=" + paisa;
    }

    public static void main(String args[]) {
        System.out.println("Enter the Rupee and Paise");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Currency c = new Currency(90, 9);
        System.out.println(c);
        Currency c1 = new Currency(a, b);
        System.out.println(c1);
        Currency c2 = new Currency();
        System.out.println(c2);
    }

}
