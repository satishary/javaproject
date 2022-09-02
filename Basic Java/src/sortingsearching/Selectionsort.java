package sortingsearching;

import java.util.Arrays;

public class Selectionsort {

    public static void main(String args[]) {
        int[] a = {16, 9, -2, 19, 4};
        int smallest = a[0];

        int position = 0;
        System.out.println(Arrays.toString(a));
        for (int i = 0; i <= a.length - 1; i++) {
            smallest = a[i];
            for (int j = i + 1; j <= a.length - 1; j++) {

                if (a[j] <= smallest) {
                    smallest = a[j];
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
