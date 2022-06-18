
package FORLOOP;

import java.util.Scanner;


public class happynumber {
    public static void main(String args[]){
        int n,r=1,num,sum=0;
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        num=n;
        while(num>9)
        {
            while(num>0)
            {
                r=num%10;
                sum=sum+(r*r);
                num=num/10;
            }
            num=sum;
            sum=0;
        }
        if(num==1){
            System.out.println("Happy number");
        }
        else{
            System.out.println("Unhappy number");
        }
    }
}
