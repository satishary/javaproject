package opps2.method;

public class Factorial {

    public static int Factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int combination(int n,int r) {

        return Factorial(n) / (Factorial(r) * Factorial(n - r));
    }

    public static void main(String args[]) {
        System.out.println(combination(5, 2));
        System.out.println(combination(5,5));

    }

}
