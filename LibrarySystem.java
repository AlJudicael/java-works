/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarysystem;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        Book book1 = new Book("Java Programming", "John Doe");
        Book book2 = new Book("Python Programming", "Jane Smith");
        Book book3 = new Book("Data Structures", "Alice Johnson");

        
        Patron patron1 = new Patron("John Smith");
        Patron patron2 = new Patron("Emily Brown");

        
        System.out.println("Library Transactions:");
        patron1.borrowBook(book1);
        patron1.borrowBook(book2);
        patron2.borrowBook(book3);

        
        System.out.println("\nPatron Information:");
        System.out.println(patron1);
        System.out.println(patron2);

        scanner.close();
    }
}

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Patron {
    private static final int MAX_BORROWED_BOOKS = 3;
    private static final double LATE_FEE = 0.50; 

    private String name;
    private Book[] borrowedBooks;
    private int numBorrowedBooks;

    public Patron(String name) {
        this.name = name;
        this.borrowedBooks = new Book[MAX_BORROWED_BOOKS];
        this.numBorrowedBooks = 0;
    }

    
    public void borrowBook(Book book) {
        if (numBorrowedBooks < MAX_BORROWED_BOOKS) {
            borrowedBooks[numBorrowedBooks] = book;
            numBorrowedBooks++;
            System.out.println(name + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println(name + " cannot borrow more books. Maximum limit reached.");
        }
    }

    
    public double calculateLateFee(int days) {
        return days * LATE_FEE;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Patron Name: ").append(name).append("\n");
        sb.append("Borrowed Books:\n");
        for (int i = 0; i < numBorrowedBooks; i++) {
            sb.append(i + 1).append(". ").append(borrowedBooks[i].getTitle()).append(" by ")
                    .append(borrowedBooks[i].getAuthor()).append("\n");
        }
        return sb.toString();
    }
}
