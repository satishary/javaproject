package basics;


import java.util.Arrays;

public class ArraysOfIncresing {

    public static void main(String[] args) {
        int i, start = 0;
        int max = 0, x = 0, y = 0;
        int a[] = {10,15,25,30,1,5,7};

        for (i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                ;// System.out.println(start + " to " + i + " length is " + (i + 1 - start));
                if ((i + 1 - start) > max) {
                    max = (i + 1 - start);
                    x = start;
                    y = i;

                }
                start = i + 1;

            }
        }
        System.out.println(x + ":" + y);
        for (i = x; i <= y; i++) {

            System.out.print(a[i] + ",");
        }
        System.out.println();
        //System.out.println(max);
        //System.out.println(Arrays.toString(a));

    }
}
