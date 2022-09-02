package sortingandsearching;

public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {5, 7, 8, -19, 76};
        int count = 0;
        for (int i = 0; i <= a.length - 2; i++) {

            if (a[i] <= a[i + 1]) {
                continue;
            }
            int t = a[i + 1];//6
            int j = i + 1;//j=4
            while (j >= 1 && a[j - 1] > t) {
                count++;
                a[j] = a[j - 1];
                j--;
            }
            a[j] = t;

        }
        System.out.println(java.util.Arrays.toString(a));
        System.out.println(count);
    }

}
