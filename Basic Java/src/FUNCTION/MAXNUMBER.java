package FUNCTION;

public class MAXNUMBER {

    public static int max2no(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int max3no(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        }
        if (b >= c) {
            return b;
        }
        return c;

    }

    public static void Table(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(a * i + ",");
        }
        System.out.println();
    }

    public static boolean isEven(int a) {

        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static int Fabonccai(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        int a = 0, b = 1, c = 0;

        //System.out.printf("%s,%s", a, b);
        for (int i = 3; i <= n; i++) {
            c = a + b;
            //System.out.printf(",%s", c);
            a = b;
            b = c;
        }
        return c;
    }

    public static int Factorial(int n) {
        int a = 1;
        for (int i = 2; i <= n; i++) {
            a = a * i;
        }
        return a;
    }

    public static int ncr(int n, int r) {
        int a = Factorial(n) / (Factorial(n - r) * Factorial(r));

        return a;
    }

    public static int Digits(int n) {
        int a = n;
        int c = 0;
        while (a > 0) {
            a = a / 10;
            c++;
        }

        return c;
    }

    public static boolean isHappy(int n) {
        /*
        
        123 = 1 2 3
        1*1 2*2 3*3=14
         */
        String record = "#" + n + "#";
        while (true) {
            int sum = 0;
            while (n > 0) {
                int rem = n % 10;
                n = n / 10;
                sum += rem * rem;
            }

            if (sum == 1) {
                return true;
            }
            n = sum;
            if (record.contains("#" + n + "#")) {
                record += "#" + n + "#";
                System.out.println(record);
                return false;
            }
            record += "#" + n + "#";

            System.out.println(record);
        }

    }

    public static void main(String args[]) {//calling a function to the name like(max2no.

        boolean t = isHappy(40);
        System.out.println(t);
    }

}
