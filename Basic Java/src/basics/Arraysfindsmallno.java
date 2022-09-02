package basics;


public class Arraysfindsmallno {

    public static void main(String args[]) {

        int a[] = {1, 2, 3, 4, 7, 9};
        int b[] = {0, 1, 2, 1, 1, 4};
        
        for (int searchvalue : a) {
           int count = 0;
            for (int i : b) {
                if (i <= searchvalue) {
                    count++;
                }

            }
            System.out.print(searchvalue + ":" + count + ",");
        }
    }

}
