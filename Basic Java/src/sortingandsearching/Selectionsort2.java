package sortingandsearching;

import java.util.Arrays;

public class Selectionsort2 {

    public static void main(String args[]) {
        int[] a = {13, 8, -5, 16, 4};
        int minimum = a[0];

        int position = 0;
        System.out.println(Arrays.toString(a));
        for (int i = 0; i <= a.length - 1; i++) {
            minimum = a[i];
            for (int j = i + 1; j <= a.length - 1; j++) {

                if (a[j] <= minimum) {
                    minimum = a[j];
                    position = j;
                }
            }
            int temp = a[i];
            a[i] = a[position];
            a[position] = temp;
            System.out.println(Arrays.toString(a));
        }

    }
}
