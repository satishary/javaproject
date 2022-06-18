package switchjava;

import java.util.Scanner;

public class leapyearswitch {

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        switch (n % 400) {
            case 0:
                System.out.println("Leap year");
                break;

            default:

                switch (n % 4) {
                    default:
                        System.out.println("Not leap year");
                        break;
                    case 0:
                        switch (n % 100) {
                            case 0:
                                System.out.println("not leap");
                                break;
                            default:
                                System.out.println("leap year");
                                break;
                        }
                        break;
                }
                break;

        }

    }

}
