package FORLOOP;

public class ForLoop {

    public static void main(String args[]) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ",");

        }
        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.print("Even ");
        for (int i = 1; i * 2 <= 10; i++) {
            System.out.print(2 * i + ",");
        }
        System.out.println();
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + ",");
        }
        System.out.println();

    }
}
