package sortingandsearching;

import java.util.Arrays;

public class Bubblesortreverse2 {

    public static void main(String args[]) {
        int a[] = {9, 8, 7, 6, 5, 4, 3, 82, 1, 0};
        System.out.println("Bubble sort Arrays..."); 

        System.out.println("0\t" + Arrays.toString(a));

        for (int i = a.length - 1; i >= 1; i--) {

            for (int j = a.length - 1; j >= 1; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;

                }

            }
        }

        System.out.println("\t" + Arrays.toString(a));

    }
}
