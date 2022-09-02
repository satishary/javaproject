package basics;


import java.util.Arrays;

public class SmallerArray {

    public static void main(String args[]) {
        int i;
        int a[] = {5, 6, 2, 3, 1, 1};

        for (i = 0; i < a.length - 1; i++) {

            if (a[i] > a[i + 1]) {
                a[i] = a[i + 1];
            } else {
                a[i] = -1;

            }

        }
        
        a[a.length-1]=-1;
        System.out.println(Arrays.toString(a));

    }

}
