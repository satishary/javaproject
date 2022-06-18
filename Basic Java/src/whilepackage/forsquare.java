package whilepackage;

public class forsquare {

    public static void main(String args[]) {
        //System.out.print("square-");
        //36=6X6
        int n=25;
        for(int i=0;i*i<=n;i++)
        {
            if(i*i==n)
            {
                System.out.println("Square");
                return;
            }
        }
         System.out.println("Not Square");
    }
}
