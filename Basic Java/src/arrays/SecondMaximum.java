package arrays;

public class SecondMaximum {

    public static void main(String args[]) {
        int a[] = {79, 76, 89, 100, 65, -3, -6, -2};
        int max1 = a[0], max2 = a[1];
        if (max2 > max1) {
            max2 = a[0];
            max1 = a[1];
        }
        System.out.println(max1 + " max1");
        System.out.println(max2 + " max2");
    }
}
