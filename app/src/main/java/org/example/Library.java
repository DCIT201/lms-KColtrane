package org.example;
import org.example.Book;


public class Library {
    private String name;
    private String address;
    private Book[] books;

    // Constructor
    public Library(String name, String address, int maxBooks) {
        this.name = name;
        this.address = address;
        this.books = new Book[maxBooks];
    }

    // Method to add a book
    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println("Book added successfully.");
                return;
            }
        }
        System.out.println("Library is full. Cannot add more books.");
    }

    // Method to display library information
    public void displayLibraryInfo() {
        System.out.println("Library Name: " + name);
        System.out.println("Address: " + address);
    }

    // Method to display books in the library
    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }
}