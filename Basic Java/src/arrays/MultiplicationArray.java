package arrays;

public class MultiplicationArray {

    public static void main(String args[]) {
        int product = 1;
        int sum = 0;
        int a[] = {1, 2, 3, 4};
        for (int i = 0; i <= a.length - 1; i++) {
            product = product * a[i];
            sum = sum + a[i];
        }
        System.out.println(product + "-multiply");
        System.out.println(sum + "-sum");
    }

}
