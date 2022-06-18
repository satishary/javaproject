
package switchjava;

import java.util.Scanner;

public class switchoddeven {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner (System.in);
        n=s.nextInt();
        switch(n % 2)
        {
            case 0: System.out.println("Even");
            break;
        
        default:
                System.out.println("odd");
        }
    }
    
}
