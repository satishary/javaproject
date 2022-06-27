package oops.cinema;

import java.util.Scanner;

public class CinemaHall {

    String name, address;
    int seat;

    public CinemaHall(String name, String address, int ticket) {
        this.name = name;
        this.address = address;
        this.seat = seat;

    }

    public CinemaHall() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Theater Detail.");
        System.out.println("Name");
        name = s.nextLine();
        System.out.println("Address");
        address = s.nextLine();
        System.out.println("Seat");
        seat = Integer.parseInt(s.nextLine());
    }

    @Override
    public String toString() {
        return "Cinema{" + "name=" + name + ", address=" + address + ", seat=" + seat + '}';
    }

    public static void main(String args[]) {
        CinemaHall c = new CinemaHall();
        System.out.println(c);
        Movies m = new Movies();
        System.out.println(m);
        Menu m1 = new Menu();
        System.out.println(m1);
    }
}
