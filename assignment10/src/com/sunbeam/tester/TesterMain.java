package com.sunbeam.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.Book;

public class TesterMain {

    public static void main(String[] args) {

        List<Book> library = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Integer choice;

        try {
            do {
                
                System.out.println("1. Add new book in list");
                System.out.println("2. Display all books in forward order");
                System.out.println("3. Sort and display books by category");
                System.out.println("4. Sort and display books by author");
                System.out.println("5. Find book by ID");
                System.out.println("0. To exit :)");
                choice = scanner.nextInt();
               

                switch (choice) {
                    case 1:
                        Book b = new Book();
                        b.accept();
                        library.add(b);
                        break;
                    case 2:
                        for (Book ele : library) {
                            System.out.println(ele);
                        }
                        break;
                    case 3:
                        
                        Collections.sort(library, (b1, b2) -> b1.getCategory().compareTo(b2.getCategory()));
                        System.out.println("Books sorted by category:");
                        for (Book book : library) {
                            System.out.println(book);
                        }
                        break;
                    case 4:
                       
                        Collections.sort(library, (b1, b2) -> b1.getAuthorName().compareTo(b2.getAuthorName()));
                        System.out.println("Books sorted by author:");
                        for (Book book : library) {
                            System.out.println(book);
                        }
                        break;
                    case 5:
                        String id;
                        System.out.println("Enter book ID to find:");
                        id = scanner.next();
                        Book foundBook = null;
                        for (Book book : library) {
                            if (book.getUniqueId().equals(id)) {
                                foundBook = book;
                                break;
                            }
                        }
                        if (foundBook != null) {
                            System.out.println("Book found:");
                            System.out.println(foundBook);
                        } else {
                            System.out.println("Book with ID " + id + " not found.");
                        }
                        break;
                    case 0:
                        System.out.println("Thank you for using it!!");
                        break;
                    default:
                        System.out.println("Enter valid choice!!");
                        break;
                }

            } while (choice != 0);
        } finally {
            scanner.close();
        }
    }
}
