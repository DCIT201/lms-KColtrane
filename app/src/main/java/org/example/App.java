package org.example;

public class App {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library("My Library", "123 Main St", 10);

        // Add some books to the library
        Book book1 = new Book("Book Title 1", "Author 1", "ISBN-1");
        Book book2 = new Book("Book Title 2", "Author 2", "ISBN-2");
        library.addBook(book1);
        library.addBook(book2);

        // Create a patron
        Patron patron = new Patron("John Doe", "johndoe@example.com");

        // Borrow a book
        patron.borrowBook(book1);

        // Return a book
        patron.returnBook(book1);
    }
}

