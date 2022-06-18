package FORLOOP;

public class FIBONACCI {

    public static void main(String args[]) {
        int a = 0, b = 1;

        int n = 10;
        System.out.printf("%s,%s", a, b);
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.printf(",%s", c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}
