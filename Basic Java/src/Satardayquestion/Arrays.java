package Satardayquestion;

public class Arrays {

    public static void main(String[] args) {
        int[] a = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(java.util.Arrays.toString(a));
        int max = a[0],water,sum =0;
        for (int i = 1; i <= a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        int lm = a[0];
        int rm = max;
        
        for (int i = 1; i <= a.length - 1; i++) {
            if (a[i-1] > lm) {
                lm = a[i-1];
            }
            if(a[i-1]==rm){
                rm =a[a.length-1];
                for(int j=i+1;j<=a.length-1;j++){
                    
                    if (rm<a[j])
                    {
                        
                        rm = a[j];
                    }
                }
                
            }
            water = lm;
            if (lm > rm) {
                water = rm;
            }
            water = water - a[i];
            if (water <0)
            {
                water = 0;
            }
            sum = sum +water;
            

        

            System.out.printf("(lm=%s,value=%s,pos=%s,rm=%s)", lm, a[i], i, rm);

        }
        System.out.println();
        System.out.println(sum);
    }
    

}
