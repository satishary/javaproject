package sortingandsearching;

import java.util.Arrays;

public class Sorting {

    public static void main(String args[]) {
        int a[] = {8, 6, 9, 5, -3};
        int min = a[0];
        int position = 0;

        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] <= min) {
                min = a[i];
                position=i;

            }

        }
          int temp=a[4];
          a[4]=a[0];
          a[0]=temp;
          
        
        System.out.println(min + " minimum");
        System.out.println(position + " position");

        System.out.println(Arrays.toString(a));
    }

}
