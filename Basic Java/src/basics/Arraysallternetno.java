package basics;


public class Arraysallternetno {

    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = 0;
        int n = 0;
        while (i <= a.length - 1) {
            System.out.print(a[i] + " ," +"Alternet number");
            i = i + 2;

        }
    }

}
