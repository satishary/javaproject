
package arrays;

import java.util.Arrays;


public class SelectionSort {
    public static void main(String[] args) {
        int[] a={9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(a));
        for(int i=0;i<=a.length-2;i++)
        {
            int minpos=i;
            for(int j=i+1;j<=a.length-1;j++)
                if(a[j]<a[minpos])
                    minpos=j;
            
            int temp=a[i];
            a[i]=a[minpos];
            a[minpos]=temp;
            System.out.println(Arrays.toString(a));
            
        }
    }
}
