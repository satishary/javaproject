
public class forprimenumber {
static boolean isPrime(int n)
{
    int limit=(int)Math.sqrt(n);
    for(int i=2;i<=limit;i++)
        if(n % i==0)
            return false;
    return true;
}
    public static void main(String args[]) {
        System.out.print("All prime no.2 to 500==");
        for (int i = 2; i <= 500; i++) {
            if(isPrime(i))
            System.out.print(i + ",");
            
        }
    }
}
