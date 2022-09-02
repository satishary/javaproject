package FUNCTION;

public class NUMTOWORD {

    public static void unitToWord(int NUMTOPRINT) {
        /*
        0-Zero
        1-One
        
        9-Nine
         */

        if (NUMTOPRINT == 0) {
            System.out.println("ZERO");
        } 
        else if (NUMTOPRINT == 1) {
            System.out.println("ONE");
        } 
        else if (NUMTOPRINT == 2) {
            System.out.println("TWO");
        } 
        else if (NUMTOPRINT == 3) {
            System.out.println("THREE");
        } 
        else if (NUMTOPRINT == 4) {
            System.out.println("FOUR");
        } 
        else if (NUMTOPRINT == 5) {
            System.out.println("FIVE");
        } 
        else if (NUMTOPRINT == 6) {
            System.out.println("SIX");
        }
        else if (NUMTOPRINT == 7) {
            System.out.println("SEVEN");
        } 
        else if (NUMTOPRINT == 8) {
            System.out.println("EIGHT");
        }
        else if (NUMTOPRINT == 9) {
            System.out.println("NINE");
        }
        else{
            System.out.println("NOT FOUND");
        }

    }


    public static void main(String args[]) {
       unitToWord(8);
    }
}
