package arrays;

public class Arraymaximum {

    public static void main(String args[]) {
        int[] a = {1, 2, 33, 4, 55, -6, 7};
        int max = a[0];
        int secondmax = a[0];
        int min = a[0];
        for (int i = 1; i <= a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
               
            }

            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println(max + " maxmimum");
        System.out.println(min + " minimum");
        System.out.println(secondmax + " Secondmax");
    }
}
