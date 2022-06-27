package oops.cinema;

import java.util.Scanner;

public class CinemaName {

    CinemaHall name;
    Movies picture;

    public CinemaName(CinemaHall name, Movies picture) {
        this.name = name;
        this.picture = picture;

    }

    public CinemaName() {//constructor bana hai....
        Scanner s = new Scanner(System.in);
        CinemaHall c = new CinemaHall();
        System.out.println(c);

        Movies m = new Movies();
        System.out.println(m);

        CinemaName c1 = new CinemaName(c, m);
        System.out.println(c1);
    }

    public static void main(String args[]) {
       // CinemaName c1 = new CinemaName();
        
        for(int i=1;i<=3;i++){
        CinemaName c1 = new CinemaName();


    }

}
}