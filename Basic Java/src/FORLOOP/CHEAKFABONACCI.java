package FORLOOP;

import java.util.Scanner;

public class CHEAKFABONACCI {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no.");
        int a=0,b=1;
        int n = 10;
        int d=s.nextInt();
        for(int i=0;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
            if(c==d){
                System.out.println("it is fabbonacci series");
            }
            
        }
    }
}
