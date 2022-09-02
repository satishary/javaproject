
package Satish;

import java.util.Scanner;


public class Book {
    
    public String bookname,publication,subject;
    int price;
    Scanner s=new Scanner(System.in);
    public Book(String bookname,String publication,String subject,int price){
        this.bookname=bookname;
        this.publication=publication;
        this.price=price; 
    }
    public Book(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter book name");
        bookname=s.nextLine();
        System.out.println("publication");
        publication=s.nextLine();
        System.out.println("price");
        price=Integer.parseInt(s.nextLine());
        
    }
    public void update(){
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter book name");
        bookname=s.nextLine();
        System.out.println("publication");
        publication=s.nextLine();
        System.out.println("price");
        price=Integer.parseInt(s.nextLine());
        
        
    }

    @Override
    public String toString() {
        return "Book{" + "bookname=" + bookname + ", publication=" + publication + ", price=" + price + ", s=" + s + '}';
    }

    

    public String getBookname() {
        return bookname;
    }

    public String getPublication() {
        return publication;
    }


    public int getPrice() {
        return price;
    }

    
    
    
    
    
    
}
