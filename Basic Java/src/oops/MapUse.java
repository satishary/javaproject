package oops;

import java.util.HashMap;
import java.util.Map;

public class MapUse {

    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Shivank");
        students.put(2, "Sachin");
        students.put(3, "Satish");
        students.put(4, "Rahul");
        students.put(5, "Rahul");
        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());
        System.out.println(students.get(30));
        System.out.println(students.getOrDefault(30,"Not Found"));
        System.out.println(students.getOrDefault(3,"Not Found"));

    }
}
