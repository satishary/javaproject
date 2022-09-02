package sortingsearching;    

public class Insertionsort {

    public static void main(String[] args) {
        int[] a = {8, 73, 4, -18, 67};
        //1,2,3,2,5,4,
        //0=0,1=1,2=2,3=1
        for (int i = 0; i <= a.length - 2; i++) {

            if (a[i] <= a[i + 1]) {
                continue;
            }
            int t = a[i + 1]; //t jo temporary file h jisme store kiye h.
            int j = i + 1;
            while (j >= 1 && a[j - 1] > t) {
                a[j]=a[j-1];
                  j--;
            }
            a[j] = t;

        }
        System.out.println(java.util.Arrays.toString(a));
    }

}
