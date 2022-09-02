package sortingsearching;

public class Bubblesort {

    public static void main(String args[]) {
        int a[] = {87, 76, 34, 98, 67, 45};
        System.out.println(java.util.Arrays.toString(a));
        for (int j = 0; j <= a.length - 2; j++) {
            for (int i = 0; i <= a.length - 2-j; i++) {
                if (a[i] > a[i + 1]) {
                    int t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                }
            }
            System.out.println(java.util.Arrays.toString(a));

        }
    }
}
