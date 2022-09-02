
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

    public static void main(String args[]) {
        int n;
        System.out.println("Enter size");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = s.nextInt();
        }
        //int [] a={1,2,29,1};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= a.length - 1; i++) {
            stack.push(a[i]);
        }

        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] != stack.pop()) {
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");

    }

}
