package basicpackage;

public class Lefthandtriangle {

    public static void main(String[] args) {
        int n = 6;
        int i,j;
        for(i=0;i<n;i++){
            
            for(j=2*(n-i);j>0;j--){
                System.out.println(" ");
                for(j=0;j<=i;j++){
                    
                    System.out.println("* "); 
                }
                System.out.println();
            }
        }
    }
}