package sortingsearching;

import java.io.Serializable;
import java.util.Scanner;

public class Result implements Serializable {

    private String rollno, name;
    private int physics, chemistry, maths;
    private transient Scanner s = new Scanner(System.in);

    public Result(String rollno, String name, int physics, int chemistry, int maths) {
        this.rollno = rollno;
        this.name = name;
        this.physics = physics;
        this.chemistry = chemistry;
        this.maths = maths;
    }

    public Result() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter roll no ");
        rollno = s.nextLine();
        System.out.println("Enter name ");
        name = s.nextLine();
        System.out.println("Enter marks in physics  ");
        physics = Integer.parseInt(s.nextLine());
        System.out.println("Enter marks in chemistry  ");
        chemistry = Integer.parseInt(s.nextLine());
        System.out.println("Enter marks in maths  ");
        maths = Integer.parseInt(s.nextLine());
    }

    public void update() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter roll no");
        rollno = s.nextLine();
        System.out.println("Enter name");
        name = s.nextLine();
        System.out.println("Enter marks in physics");
        physics = Integer.parseInt(s.nextLine());
        System.out.println("Enter marks in chemistry");
        chemistry = Integer.parseInt(s.nextLine());
        System.out.println("Enter marks in maths");
        maths = Integer.parseInt(s.nextLine());

    }

    public int getTotal() {
        return physics + chemistry + maths;
    }

    public double getPercent() {
        return getTotal() / 3.0;
    }

    @Override
    public String toString() {
        return "Result{" + "rollno=" + rollno + ", name=" + name + ", physics=" + physics + ", chemistry=" + chemistry + ", maths=" + maths + ", total=" + getTotal() + ", percent=" + getPercent() + "% " + '}';
    }

    public String getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public int getPhysics() {
        return physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public int getMaths() {
        return maths;
    }
}
