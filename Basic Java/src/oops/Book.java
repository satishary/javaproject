/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

/**
 *
 * @author Ramjee Bharti
 */
public class Book {

    String bookname, subject;
    int price;

    public Book(String b, String s, int p) {
        bookname = b;
        subject = s;
        price = p;
    }

    public void display() {
        System.out.printf("Book name=%s,subject=%s,Price=%s\n", bookname, subject, price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Basic C", "C", 150);
        Book b2 = new Book("Adv Java", "Java", 350);
        b1.display();
        b2.display();
        System.out.println(b1);
        System.out.println(b2);
    }
}
