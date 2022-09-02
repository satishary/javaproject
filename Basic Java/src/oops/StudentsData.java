package oops;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentsData {

    public static void main(String[] args) {
        String filename = "d:\\students.txt";
        Map<Integer, Student> students = new HashMap<>();
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
            students = (Map<Integer, Student>) in.readObject();
            in.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        Scanner s = new Scanner(System.in);
        System.out.println("Student Entry");

        while (true) {
            System.out.println("0-Exit,1-Insert Name,2-Search,3-Remove,4-All.");
            int n = Integer.parseInt(s.nextLine());

            switch (n) {
                case 0: {
                                                                                                                                                 
                    ObjectOutputStream out;
                    try {
                        out = new ObjectOutputStream(new FileOutputStream(filename));
                        out.writeObject(students);
                        out.flush();
                        out.close();
                    } catch (Exception ex) {
                        System.out.println(ex);

                    }
                    System.out.println("Exit");
                    return;
                }
                case 1: {
                    System.out.println("Insert");
                    System.out.println("Enter the roll no.");
                    int r = Integer.parseInt(s.nextLine());
                    System.out.println("Enter the name");
                    Student name = new Student();
                    students.put(r, name);
                    break;
                }
                case 2: {
                    System.out.println("Search");
                    System.out.println("Enter roll no.");
                    int r = Integer.parseInt(s.nextLine());
                    Object name = students.get(r);
                    if (name == null) {
                        name = "Not found";
                    }
                    System.out.println(name);

                    break;
                }
                case 3: {
                    System.out.println("Remove");
                    System.out.println("Enter roll no.");
                    int r = Integer.parseInt(s.nextLine());
                    students.remove(r);
                    break;
                }
                case 4: {
                    System.out.println("All students");
                    Set<Integer> rollnumbers = students.keySet();
                    for (int rollno : rollnumbers) {
                        System.out.println(rollno + ":" + students.get(rollno));


                        /* System.out.println("students");
                    for (int i = 0; i <= 5; i++) {
                        int r;
                        System.out.println(i);*/
                    }
                    break;
                }
            }
        }
    }

}
