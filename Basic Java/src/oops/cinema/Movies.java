
package oops.cinema;

import java.util.Scanner;


public class Movies {
    String Director,Producer,Country,Category,Actors,Acctress,MovieLenght;
    int ReleasingYear;
    
    public Movies(String Director,String Producer,String Country,String Category,String Actors,String Acctress,String MovieLenght){
        this.Director=Director;
        this.Producer=Producer;
        this.Country=Country;
        this.Category=Category;
        this.Actors=Actors;
        this.Acctress=Acctress;
        this.MovieLenght=MovieLenght;
        this.ReleasingYear=ReleasingYear;
    }
    
    public Movies(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Movies Detail.");
        System.out.println("Director");
        Director=s.nextLine();
        System.out.println("Producer");
        Producer=s.nextLine();
        System.out.println("Country");
        Country=s.nextLine();
        System.out.println("Category");
        Category=s.nextLine();
        System.out.println("Actors");
        Actors=s.nextLine();
        System.out.println("Actress");
        Acctress=s.nextLine();
        System.out.println("MovieLenght");
        MovieLenght=s.nextLine();
        System.out.println("ReleasingYear");
        ReleasingYear=Integer.parseInt(s.nextLine());
    }

    @Override
    public String toString() {
        return "Movies{" + "Director=" + Director + ", Producer=" + Producer + ", Country=" + Country + ", Category=" + Category + ", Actors=" + Actors + ", Acctress=" + Acctress + ", MovieLenght=" + MovieLenght + ", ReleasingYear=" + ReleasingYear + '}';
    }
    public static void main(String args[]){
        Movies m=new Movies();
            System.out.println(m);
    }
    
}

