package PatternProgramming;

public class SquareBox {

    public static void main(String[] args) {
        int noofrows = 11;
        
        for (int i = 1; i <= noofrows; i++) {
            for (int j = 1; j <= noofrows; j++) {
                if (j == 1 || j == noofrows || i == 1 || i == noofrows||i==j ||i+j==noofrows+1 ) {
                    
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println(" ");

    }

}
