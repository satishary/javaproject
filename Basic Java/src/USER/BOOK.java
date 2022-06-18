package USER;

public class BOOK {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static int threemax(int a, int b, int c) {
        if (a >= b) {
            return a;
        } else if (b >= c) {
            return b;
        } else {
            return c;
        }
    }

    /*
        1. Make a function to find the max of 2 numbers and 3 numbers
        
        
     */
    public static void main(String[] args) {

        int answer = add(1, 2);
        System.out.println("Add " + answer);

        answer = multiply(4, 5);
        System.out.println("Multi " + answer);

        answer = subtract(6, 3);
        System.out.println("sub " + answer);

        answer = max(4, 5);
        System.out.println("max " + answer);

        answer = threemax(8, 9, 12);
        System.out.println("three max " + answer);

    }

}
