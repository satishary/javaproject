package FORLOOP;

public class FIBONACIIREVESE {

    public static void main(String args[]) {
        int a = 8, b = 5;
        int c = a - b;
        System.out.println(a);
        System.out.println(b);
        while (c > 0) {
            System.out.println(c);
            a=b;
            b=c;
            c=a-b;
        }
        System.out.println(c);
    }

}
