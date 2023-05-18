package com.company;

public class Book {
    String titled;
    boolean borrowed;

    // Creates a new Book
    public Book(String bookTitle) {
        this.titled= bookTitle;
        borrowed = false;
    }

    public void borrowed(String borrow) {
        // Marks the book as rented
        this.rented();
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        return borrowed;
    }
    // Returns the title of the book
    public String getTitle() {
        return this.titled;
    }

    public void rented(){
        //the book is rented so, item is borrowed, yes true
        this.borrowed = true;
    }

    public void returned() {
        //the book is returned, so item is not borrowed, no false
        this.borrowed = false;
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Pragmatic Programmer");
        System.out.println("Title (should be The Pragmatic Programmer): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.rented();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
} 