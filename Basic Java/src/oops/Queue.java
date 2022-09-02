package oops;

import java.util.ArrayDeque;

public class Queue {

    public static void main(String args[]) {
        java.util.Queue queue = new ArrayDeque();
        int n = 10;
        for (int i = 1; i <= 10; i++) {
            queue.add(i);
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

}
