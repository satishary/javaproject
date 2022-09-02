package sortingsearching;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Results {

    private static String filepath = "D:\\bank\\bank.txt";

    private static void saveResults(List<Result> results) {
        try {
            FileOutputStream out = new FileOutputStream(filepath);
            ObjectOutputStream stream = new ObjectOutputStream(out);
            stream.writeObject(results);
            out.flush();
            out.close();
            stream.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private static List<Result> getResults() {
        try {

            FileInputStream in = new FileInputStream(filepath);
            ObjectInputStream stream = new ObjectInputStream(in);
            List<Result> results = (List<Result>) stream.readObject();
            stream.close();
            in.close();
            return results;
        } catch (Exception ex) {
            System.out.println(ex);
            return new ArrayList<>();
        }
    }

    public static void main(String args[]) {

        List<Result> results = getResults();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("0-Exit,1-Search,2-Add,3-Remove,4-All,5-Update");
            int n = Integer.parseInt(s.nextLine());
            switch (n) {

                case 0:
                    System.out.println("Exit");
                    saveResults(results);
                    return;

                case 1:
                    System.out.println("enter your roll number to Search");

                     {
                        String rollno = s.nextLine();
                        boolean found = false;
                        for (Result result : results) {
                            if (result.getRollno().equals(rollno)) {
                                System.out.println(result);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Not found");
                        }
                    }

                    break;
                case 2:
                    System.out.println(" Add  ");
                     {
                        Result result = new Result();
                        results.add(result);
                    }
                    break;
                case 3:
                    System.out.println(" Enter your roll number to remove");

                     {
                        String rollno = s.nextLine();
                        //String name=s.nextLine();
                        boolean found = false;
                        for (Result result : results) {
                            if (result.getRollno().equals(rollno)) {
                                results.remove(result);
                                System.out.println("Removed");
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Not found");
                        }
                    }

                    break;
                case 4:
                    System.out.println("All");
                     {
                        for (Result result : results) {
                            System.out.println(result);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Enter roll no");
                    String rollno = s.nextLine();
                    boolean found = false;
                    for (Result result : results) {
                        if (result.getRollno().equals(rollno)) {
                            result.update();
                            found = true;
                            break;
                        }
                    }

            }

        }

    }
}
