package basics;


public class IndexValue {

    public static void main(String args[]) {
        int a[] = {5, 2, 45, 12, 7};
        for (int i = 0; i < a.length - 1; i++) {

            if (i+1==a[i] ){
                System.out.println(a[i]);
            }

        }
        
    }
}
