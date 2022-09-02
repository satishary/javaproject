package arraylistuse;

import java.util.ArrayList;
import java.util.Scanner;

public class Task {

    public static void main(String args[]) {
        final int NOOFTASKS = 10;
        int nooftaskdetails = 0;
        ArrayList<TaskDetail> tasks = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("0. create 1. Edit 2. Delete 3. Exit,4.View");

            int n = Integer.parseInt(s.nextLine());
            switch (n) {

                case 0: {
                    System.out.println("Task No. ,Task Name ,Details ,Status");
                    TaskDetail taskDetail = new TaskDetail(nooftaskdetails + 1);
                    System.out.println(taskDetail);
                    tasks.add(taskDetail);
                    nooftaskdetails++;
                    break;
                }
                case 1: {

                    System.out.println("Edit");
                    System.out.println("Enter taskno");
                    int taskno = Integer.parseInt(s.nextLine()) - 1;
                    if (taskno < 0 || taskno >= nooftaskdetails) {
                        System.out.println("Invalid task no");
                        break;
                    }
                    tasks.get(taskno).newStatus();
                    break;
                }
                case 2: {
                    System.out.println("Delete");
                    System.out.println("Enter taskno");
                    int taskno = Integer.parseInt(s.nextLine()) - 1;
                    if (taskno < 0 || taskno >= nooftaskdetails) {
                        System.out.println("Invalid task no");
                        break;
                    }
                    tasks.remove(taskno);

                    break;
                }
                case 3:
                    System.out.println("Exit");
                    return;
                case 4:
                    System.out.println("View");
                    for (TaskDetail detail : tasks) {
                        System.out.println(detail);
                    }

                    break;

            }

        }
    }

}
