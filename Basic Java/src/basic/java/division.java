/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.java;
import java.util.Scanner;
/**
 *
 * @author Ramjee Bharti
 */
public class division {
    public static void main(String args[])
    {
        //program to  division of two numbers.
        int a,b;
        Scanner s=new Scanner (System.in);
        System.out.println("Enter two number");
        a=s.nextInt();
        b=s.nextInt();
        double div=a/(double)b;
        int sum1=a%b;
        System.out.println(div);
        System.out.println(sum1);
        
    }
}
