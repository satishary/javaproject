package oops.cinema;

import java.util.Scanner;

public class Task {

    public static void main(String args[]) {
        final int NOOFTASKS = 10;
        int nooftaskdetails = 0;
        TaskDetail[] tasks = new TaskDetail[NOOFTASKS];

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("0. create 1. Edit 2. Delete 3. Exit,4.View");

             int n = Integer.parseInt(s.nextLine());
            switch (n) {

                case 0: {
                    System.out.println("Task No. ,Task Name ,Details ,Status");
                    TaskDetail t1 = new TaskDetail();
                    System.out.println(t1);
                    tasks[nooftaskdetails] = t1;
                    nooftaskdetails++;
                    break;
                }
                case 1: {
                    
                       
                    System.out.println("Edit");
                    System.out.println("Enter taskno");
                    int taskno = Integer.parseInt(s.nextLine())-1;
                    if(taskno<0 || taskno>=nooftaskdetails)
                    {
                        System.out.println("Invalid task no");
                        break;
                    }
                    tasks[taskno].newStatus();
                    break;
                }
                case 2:
                    System.out.println("Delete");
                    break;
                case 3:
                    System.out.println("Exit");
                    return;
                case 4:
                    System.out.println("View");
                    for (int i = 0; i <= nooftaskdetails - 1; i++) {
                        System.out.println(tasks[i]);
                    }
                    System.out.println();
                    break;

            }

        }
    }

}
