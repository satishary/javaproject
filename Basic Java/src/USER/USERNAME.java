package USER;

import java.util.Scanner;

public class USERNAME {

    public static void main(String args[]) {
        int username, password;
        //username = 1, password = 2

        System.out.println("Enter you user name");
        Scanner s = new Scanner(System.in);
        username = s.nextInt();
        System.out.println("Enter your password");
        password = s.nextInt();
        if (username == 1 && password == 2) {
            System.out.println("correct");

        }
        else {
            System.out.println("wrong");
        }

    }
}
