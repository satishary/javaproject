package PatternProgramming;

public class ZeddPrint {

    public static void main(String args[]) {
        int noofrows = 8;
        for (int i = 0; i <= noofrows; i++) {
            for (int j = 1; j <= noofrows; j++) {
                if (i == 1 || i == noofrows || i + j == noofrows + 1) {

                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
