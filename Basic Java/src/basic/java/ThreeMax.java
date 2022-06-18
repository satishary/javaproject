/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.java;

import java.util.Scanner;

public class ThreeMax {

    public static void main(String args[]) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        int max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println(max);
    }

}
