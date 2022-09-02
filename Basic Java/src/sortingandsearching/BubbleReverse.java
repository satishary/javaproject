;package sortingandsearching;

import java.util.Arrays;

public class BubbleReverse {

    public static void main(String args[]) {
        int a[] = {67, 98, 54, 34, 32, 12, 65};
        System.out.println("Bubble Sorted Arrays:-");

        System.out.println("0\t" + Arrays.toString(a));

        for (int i = 0; i <= a.length - 2; i++) {//access the arrays element outter loop

            {
                for (int j = 0; j <= a.length -2 -i; j++)//inner loop.
                {
                    if (a[j] > a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
                //   System.out.println(Arrays.toString(a));

            }
            System.out.println((i + 1) + "\t" + Arrays.toString(a));

        }

    }

}
