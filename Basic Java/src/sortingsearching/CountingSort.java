package sortingsearching;

import java.util.Arrays;

public class CountingSort {
    
    public static void main(String args[]) {
        
        int[] frequencies = new int[10];
        
        int a[] = {5, 4, 0, 3, 2, 0, 4, 3, 4};
        System.out.println(Arrays.toString(a) + "Arrays define");
        for (int i = 0; i <= a.length - 1; i++) {
            
            frequencies[a[i]]++;
        }
        System.out.println(Arrays.toString(frequencies) +"count no. comes ");
        for (int i = 1; i <= frequencies.length - 1; i++) {
            
            frequencies[i] += frequencies[i - 1];
        }
        
        System.out.println(Arrays.toString(frequencies) + "Arrays positioning value comes");
        int[] b = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            int value = a[i];
            int frequency = frequencies[value];
            b[frequency - 1] = value;
            frequencies[value]--;
            
        }
        System.out.println(Arrays.toString(b) + "Counting Arrays sorted");
        
    }
    
}
