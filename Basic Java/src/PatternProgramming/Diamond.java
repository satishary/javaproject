package PatternProgramming;

public class Diamond {

    public static void main(String[] args) {
        int noofrows = 4;
        for (int rows = 1; rows <= noofrows; rows++) {
            for(int space=1;space<=noofrows-rows;space++){
                System.out.print(" ");
            }
            for (int i = 1; i <= rows; i++) {
                System.out.print("*");
            }
             for (int i = rows-1; i >=1; i--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int rows =noofrows; rows >= 1; rows--) { 
            for(int space=1;space<=noofrows-rows;space++){
                System.out.print(" ");
            }
            for (int i = 1; i <= rows; i++) {
                System.out.print("*");
            }
             for (int i = rows-1; i >=1; i--) {
                System.out.print("*");
            }
            System.out.println("");
        }
     
    }
}
