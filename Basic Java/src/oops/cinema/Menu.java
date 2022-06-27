package oops.cinema;

import java.util.Scanner;

public class Menu {

    public static void main(String args[]) {
        final int NOOFHALLS = 10;
        int noofcinemas = 0;
        CinemaHall[] cinemas = new CinemaHall[NOOFHALLS];
        Scanner s = new Scanner(System.in);
        final int NOOFMOVIES = 10;
        int noofmovies = 0;
        Movies[] movies = new Movies[NOOFMOVIES];

        while (true) {
            System.out.println("0-Exit,1-Search,2-Booking,3-Cancel, 4- Enter Cinema, 5-Enter Movie");
            int n = Integer.parseInt(s.nextLine());
            switch (n) {
                case 0:
                    System.out.println("Exit");
                    return;
                case 1:
                    System.out.println("Search");
                    for (int i = 0; i <= noofcinemas - 1; i++) {
                        System.out.println(cinemas[i]);
                    }
                    break;
                case 2:
                    System.out.println("Booking");
                    break;
                case 3:
                    System.out.println("Cancel");
                    break;
                case 4:
                    System.out.println("Enter The Cinema hall");
                    cinemas[noofcinemas] = new CinemaHall();
                    noofcinemas++;
                    break;
                case 5:
                    System.out.println("Enter The Movie");
                    movies[noofmovies] = new Movies();
                    noofmovies++;
                    break;
            }
        }
    }
}
