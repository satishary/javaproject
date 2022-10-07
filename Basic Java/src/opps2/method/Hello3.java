package opps2.method;

public class Hello3 { // Hello3 is class name

    public static void printHello3(int n, String message) {   //printHello3 method int n,and String message.
        for (int i = 1; i <= n; i++) {      //using for loop
            System.out.println(message);
        }
    }

    public static void main(String args[]) {
        printHello3(3, "Satish"); //printHello3 to print 3 tyms satish.. 
        printHello3(4, "Rohit");  // printHello3 to print 4 tyms rohit..
        printHello3(2, "Shudhanshu"); // printHello3 print 2 tyms shudhanshu..
    }
}
