package collectionspackage;

import java.util.ArrayDeque;
import java.util.Queue;


public class QueueUse {
    public static void main(String[] args) {
        Queue<String> queue=new ArrayDeque<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.forEach(s->{
            System.out.println(s);});
    }
}