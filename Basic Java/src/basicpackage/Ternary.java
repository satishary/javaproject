package basicpackage;

import java.util.Scanner;
public class Ternary {
    public static void main(String args[]){
        int a,b,c;
         Scanner s=new Scanner(System.in);
        System.out.println("Enter three no.");
                a=s.nextInt();
                b=s.nextInt();
                c=s.nextInt();
                int max=(a>=b)?a:b;
                System.out.println("Max = " + max);
                int min=(a<=b)?a:b;
                System.out.println("Min =" + min);
                
                max=(a>=b)?  (a>=c)?a:c  : (b>=c)? b:c;
                System.out.println("Max = " + max);
                
               
    }
            
    
}
