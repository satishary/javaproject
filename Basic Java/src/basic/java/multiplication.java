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
public class multiplication {
    public static void main(String args[]){
       
    
            int a,b;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter two numbers");
            a=s.nextInt();
            b=s.nextInt();
            int sum=a*b;
            System.out.println(sum);
    }    
    
}
