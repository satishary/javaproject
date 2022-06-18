package basicpackage;


public class fibonaccisequence {

    public static void main(String args[]) {
        System.out.print("fibonacci sequence\n");
        System.err.print("0,1");
        int a = 0, b = 1;
        for (int i = 3; i <= 10; i++)
        {
            int c = a + b;
            a = b;
            b = c;
            System.err.print("," + c);

        }
        System.err.println();

    }
}
