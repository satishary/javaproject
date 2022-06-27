package oops.cinema;

import java.util.Scanner;

public class TaskDetail {

    String  taskname, detail, status;
    int taskno;
    public TaskDetail(int taskno, String taskname, String detail, String status) {
        this.taskno = taskno;
        this.taskname = taskname;
        this.detail = detail;
        this.status = status;

    }

    public TaskDetail() {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Task Detail");
        System.out.println("Task Number");
         taskno = Integer.parseInt(s.nextLine());
        System.out.println("Task Name");
        taskname = s.nextLine();
        System.out.println("Detail");
        detail = s.nextLine();
        System.out.println("Status");
        status = s.nextLine();
    }
public void newStatus()
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter new status");
    String newstatus=s.nextLine();
    status=newstatus;
}
    @Override
    public String toString() {
        return "Taskdetail{" + "taskno=" + taskno + ", taskname=" + taskname + ", detail=" + detail + ", status=" + status + '}';
    }

    public static void main(String[] args) {
        TaskDetail t = new TaskDetail();
        System.out.println(t);
        Task t1=new Task();
        System.out.println(t1);
    }

}
