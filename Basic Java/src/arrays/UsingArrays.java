package arrays;

public class UsingArrays {

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 7};
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print("," + a[i]);
        }
        System.out.println();
        for (int i : a) {
            System.out.print("," + i);
        }
        System.out.println();
    }
}
