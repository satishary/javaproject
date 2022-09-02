package oops.cinema;

import java.util.ArrayDeque;
import java.util.Scanner;

public class QueueMenu {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Queue Number");
        java.util.Queue queue = new ArrayDeque();

        while (true) {
            System.out.println("0-Exit  1-In  2-Out  3-View ");
            int option = Integer.parseInt(s.nextLine());
            switch (option) {

                case 0: {
                    
                    System.out.println("Exit");
                    return;
                }

                case 1: {
                    System.out.println("Enter Number");
                    int n = Integer.parseInt(s.nextLine());
                    queue.add(n);
                    System.out.println(queue);
                    break;
                }
                case 2: {
                    System.out.println("Out");
                    if (!queue.isEmpty())
                        System.out.println(queue.remove());
                    
                    
                    break;
                }

                case 3: {
                    System.out.println("View");
                    System.out.println(option);
                    return;
                }

            }
        }
    }
}
