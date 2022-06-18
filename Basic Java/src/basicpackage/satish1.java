package basicpackage;

import java.util.Scanner;
public class satish1 {
    public static void main(String args[])
    {
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two no.");
                a=s.nextInt();
                b=s.nextInt();
                int large;
                if(a>=b){
                    large=a;
                }
                else {
                    large=b;
                    
                }
                 System.out.println(large);
    }
    
}
