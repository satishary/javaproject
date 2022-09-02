package Satish;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        while (true) {

            System.out.println("0-Exit,1-Search,2-Add,3-Remove,4-All,5-Update");

            int n = Integer.parseInt(s.nextLine());
            switch (n) {
                case 0:
                    System.out.println("Exit");
                    return;
                case 1:
                    System.out.println("Search");
                    System.out.println("Enter bookname");
                     {
                        String bookname = s.nextLine();
                        for (Book book : books) {
                            if (book.getBookname().equals(bookname)) {
                                System.out.println(book);
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Add");
                     {
                        Book book = new Book();
                        books.add(book);
                    }

                    break;
                case 3:
                    System.out.println("Remove");
                    System.out.println("Enter book name");
                    String bookname = s.nextLine();
                    for (Book book : books) {
                        if (book.getBookname().equals(bookname)) {
                            books.remove(book);
                            System.out.println("Removed");
                        }
                    }

                    break;
                case 4:
                    System.out.println("All");

                    for (Book book : books) {
                        System.out.println(book);
                    }

                    break;
                case 5:
                    System.out.println("Update");
                    System.out.println("Enter book name");
                    String booksname = s.nextLine();
                    for (Book book : books) {
                        if (book.getBookname().equals(booksname)) {
                            book.update();
                        }
                    }
                    break;

            }

        }
    }
}
