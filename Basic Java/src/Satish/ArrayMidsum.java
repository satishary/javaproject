package Satish;

public class ArrayMidsum {

    public static void main(String args[]) {
        int a[] = {1, 2, 5, 3, 0};
        int sum = 0, left = a[0], right = 0;
        int flag = 1;

        for (int i = 0; i < a.length; i++) {

            sum = sum + a[i];
           // System.out.println(+sum);
        }
        right = sum;
        for (int i = 1; i < a.length; i++) {
            left = left + a[i];
            right = right - a[i - 1];
            if (left == right) {
                System.out.println(i);
                  System.out.println(left);
                   System.out.println(right);
                   flag = 0;
                   break;
            }

        }
        if (flag==1){
            System.out.println("not found mid array sum");
        }
        

    }
}
