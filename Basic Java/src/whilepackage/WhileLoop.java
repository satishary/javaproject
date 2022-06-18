package whilepackage;

public class WhileLoop {

    public static void main(String[] args) {
        int i=1;
        int n=10;
        while(i<=n)
        {
            System.out.print(i + ",");
            i++;
        }
        System.out.println();
        i=1;
         do
        {
            System.out.print(i + ",");
            i++;
        }
         while(i<=n);
        System.out.println();
    }

}
