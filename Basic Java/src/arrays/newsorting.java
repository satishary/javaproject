package arrays;

import java.util.Arrays;

public class newsorting {

    public static void main(String args[]) {
        int a[] = {8, 6, 9, 5, -3};
        int min = a[0];
        int position = 0;
        System.out.println(Arrays.toString(a));
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] <= min) {
                min = a[i];
                position = i;   

            }

        }

        int temp = a[0];
        a[0] = a[position];
        a[position] = temp;
        

        System.out.println(Arrays.toString(a));
    }

}
