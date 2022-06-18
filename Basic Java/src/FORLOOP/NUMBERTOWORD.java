package FORLOOP;

import java.util.Scanner;

public class NUMBERTOWORD {

    public static void main(String args[]) {
        int n, d = 786;
        String output = "";

        while (d > 0) {
            n = d % 10;// 786 % 10 =6
            d = d / 10;//786/10  78 
            switch (n) {
                case 0: {
                    output = "zero " + output;
                    break;
                }
                case 1: {
                    output = "one " + output;
                    break;
                }
                case 2: {
                    output = "two " + output;
                    break;
                }
                case 3: {
                    output = "three " + output;
                    break;
                }
                case 4: {
                    output = "four " + output;
                    break;
                }
                case 5: {
                    output = "five " + output;
                    break;
                }
                case 6: {
                    output = "six " + output;
                    break;
                }
                case 7: {
                    output = "seven " + output;
                    break;
                }
                case 8: {
                    output = "eight " + output;
                    break;
                }
                case 9: {
                    output = "nine " + output;
                    break;
                }

                default: {
                    output = "notfound" + output;

                    break;
                }

            }
        }
        System.out.println(output +"786");
    }

}