package FORLOOP;

import java.util.Scanner;

public class TABLE {

    public static void main(String args[]) {
        int a;
        System.out.println("Enter the no.");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        for (int i = 0; i <= 10; i++) {
            //System.out.println(a + "\tX\t" + i + "=\t" + a * i);
            System.out.printf("%4sX%4s=%4s\n",a,i,i*a);

        }
    }
}
