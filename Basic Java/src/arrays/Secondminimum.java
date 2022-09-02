package arrays;

public class Secondminimum {

    public static void main(String args[]) {
        int a[] = {4, 6, 9, -4, -3};
        int min1 = a[0];
        int min2 = a[1];
        int max1 = a[0];
        int max2 = a[1];

        if (min2 < min1) {
            min2 = a[0];
            min1 = a[1];
        }

        if (max2 > max1) {
            max2 = a[0];
            max1 = a[1];
        }

        for (int i = 2; i <= a.length - 1; i++) {
            int current = a[i];
            if (current <= min1) {
                min2 = min1;
                min1 = current;
                continue;
            }
            if (current < min2) {
                min2 = current;
            }

            
            if (current >= max1) {
                max2 = max1;
                max1 = current;
                continue;
            }
            if (current > max2) {
                max2 = current;
            }
        }
        System.out.println(min1 + " minimum1");
        System.out.println(min2 + " minimum2");
        System.out.println(max1 + " maximum1");
        System.out.println(max2 + " maximum2");
    }
}
