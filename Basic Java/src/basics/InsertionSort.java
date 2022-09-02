package basics;


import java.util.Arrays;

public class InsertionSort {

    public static void main(String args[]) {
        int a[] = {-3, 12, -4, -100, 8, 45};
        //i+1 <= length-1==6-1 = 5
        for (int i = 0; i <= a.length - 2; i++) {

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
