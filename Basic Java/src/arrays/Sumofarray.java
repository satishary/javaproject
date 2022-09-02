package arrays;

public class Sumofarray {

    public static void main(String args[]) {
        int sum = 0;//this sum variable useto all sum;
        int a[] = {1, 2, 3};
        for (int i = 0; i <= a.length - 1; i++) {
            sum = sum + a[i];

        }
        System.out.println(sum);
    }

}
