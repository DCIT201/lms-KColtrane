package org.example;

public class Patron {
    private String name;
    private String email;

    // Constructor
    public Patron(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Method to borrow a book
    public void borrowBook(Book book) {
        System.out.println(name + " has borrowed " + book.getTitle());
    }

    // Method to return a book
    public void returnBook(Book book) {
        System.out.println(name + " has returned " + book.getTitle());
    }
}