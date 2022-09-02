package basics;


public class SerialnoArrays {

    public static void main(String args[]) {
        int a[] = {0, 1, 2, 1, 1, 4};
        int count = 0;
        int searchvalue = 2;
        for (int i : a) {
            if (i <= searchvalue) {
                count++;
            }
        }
        System.out.println(count + "small arrays");
        int even = 0, odd = 0;
        for (int n : a) {

            if (n % 2 == 0) {

                even++;
            } else {

                odd++;
            }
        }
        System.out.println(even + "even");
        System.out.println(odd + "odd");

    }

}
