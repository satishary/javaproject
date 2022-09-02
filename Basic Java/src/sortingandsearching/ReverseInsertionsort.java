package sortingandsearching;

import java.util.Arrays;

public class ReverseInsertionsort {

    public static void main(String args[]) {
        int[] a = {5, 7, 8, -19, 4,8,2};

        for (int i = a.length - 1; i <= 1; i--) {

            if (a[i] <= a[i + 1]) {
                continue;
            }
            int t = a[i + 1];
            int j = i + 1;
            while (j >= 1 && a[j - 1] > t) {
           
                a[j] = a[j - 1];
                j--;
            }
            a[j] = t;
            
            

        }
        System.out.println(Arrays.toString(a));

    }
}
