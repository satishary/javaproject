
package opps2.method;


public class Hello2 {
public static void printHello2(int n) //printHello2 is class name and int n is variable.
{
    
   for(int i=1;i<=n;i++)
        System.out.println("Hello");
}
public static void main(String arg[]){
    printHello2(5);// print hello 5 times.
    printHello2(3);// print hello 3 times.
    printHello2(2);// print hello 2 times.
}
}