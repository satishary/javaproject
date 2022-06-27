package oops;

import java.util.Scanner;

public class Person { //classs hai

    String name, address;
    int age;

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Person() {   //constructor hai
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the person details");
        System.out.println("Enter the Name");
        name = scanner.nextLine();
        System.out.println("Enter the Address");
        address = scanner.nextLine();
        System.out.println("Enter the Age");

        age = Integer.parseInt(scanner.nextLine());

    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", age=" + age + '}';
    }

    public static void main(String args[]) {// ye main method hai 

        Person p = new Person();
        System.out.println(p);
        Person p1 = new Person("Sourav", "Kolkata", 44);
        System.out.println(p1);
        Person p2 = new Person();
        System.out.println(p2);
        Person p3 = new Person("Rihaan", "mumbai", 26);
        System.out.println(p3);

    }

}
