package ifelse;

import java.util.Scanner;

public class TIMEAMPM {

    public static void main(String args[]) {
        /*night 12=0
        0-11 AM
        Afternoon 12 is PM
        13 to 23 is PM
        17 5 PM
        
        
        
         */
        int hour, min;
        System.out.println("Enter time");
        Scanner s = new Scanner(System.in);
        hour = s.nextInt();
        min = s.nextInt();
        if (hour <=11) {
            System.out.println(hour + ":"  + min + " am");
        } else if(hour==12) {
            System.out.println(hour + ":"  + min + " pm");

        }
        else
        {
            System.out.println((hour-12) + ":"  + min + " pm");
        }
    }

}
