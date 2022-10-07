
package oops;


public class Book {

    String bookname, subject;
    int price;

    public Book(String b, String s, int p) 
    {
        bookname = b;
        subject = s;
        price = p;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Basic C", "C", 150);
        Book b2 = new Book("Adv Java", "Java", 350);
        System.out.println(b1);
        System.out.println(b2);
    }
        
            public String toString()
            {
            return String.format("Book Name=%s,Subject=%s,Price=%s", bookname, subject, price);
            }  
 }

