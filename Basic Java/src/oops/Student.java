package oops;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable{

    private String name, address;
    private int age;

    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Student() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name");
        name = s.nextLine();
        System.out.println("Enter your Age");
        age = Integer.parseInt(s.nextLine());
        System.out.println("Enter the Address");
        address=s.nextLine();

    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", address=" + address + ", age=" + age + '}';
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);
    }

}
