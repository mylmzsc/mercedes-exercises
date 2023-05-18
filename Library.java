package com.company;

import java.util.ArrayList;

public class Library {
	//Here we have the library name and the booklist it keeps
	String name;
	ArrayList<Book> bookList;

	public Library(String name) {
		this.name = name;
		this.bookList = new ArrayList<Book>();
	}

	// Add the missing implementation to this class
	public void printAvailableBooks() {
		if(this.bookList.size() == 0){
			System.out.println("There are no books that are available in this library. ");
		}
		else{
			String title;
			for (int i = 0; i < this.bookList.size(); i++) {
				title = bookList.get(i).getTitle();
				if(!bookList.get(i).isBorrowed()){
					System.out.println(title);
				}
			}
		}

	}

	public void addBook(Book book) {
		this.bookList.add(book);
	}
	public void borrowBook(String bookname){
		boolean exists= false;

		for(int i = 0; i< bookList.size() ;i++){
			if((bookList.get(i).getTitle()).equals(bookname) && !bookList.get(i).isBorrowed()){
				bookList.get(i).rented();
				System.out.println("You successfully borrowed: " + bookname);
				exists = true;
			}
			else if((bookList.get(i).getTitle()).equals(bookname) && bookList.get(i).isBorrowed()){
				System.out.println("Sorry, this book is already borrowed. ");
				exists = true;
			}

		}
		if (!exists) {
			System.out.println("Sorry, this book is not in our catalog. ");
		}

		}
	public void returnBook(String bookname){
		for(int i = 0; i< bookList.size() ;i++){
			if((bookList.get(i).getTitle()).equals(bookname)){
				bookList.get(i).returned();
				System.out.println("You successfully returned: " + bookname);
			}
		}
	}


	public static void main(String[] args) {
		//create libraries
		Library firstLibrary = new Library("firstLibrary");
		Library secondLibrary = new Library("secondLibrary");

		// Add four books to the first library
		firstLibrary.addBook(new Book("The Pragmatic Programmer"));
		firstLibrary.addBook(new Book("Code - The Hidden Language"));
		firstLibrary.addBook(new Book("Programming Pearls"));
		firstLibrary.addBook(new Book("Domain Driven Design in Life"));


		// Try to borrow The Pragmatic Programmer from both libraries
		System.out.println("Borrowing The Pragmatic Programmer:");
		firstLibrary.borrowBook("The Pragmatic Programmer");
		firstLibrary.borrowBook("The Pragmatic Programmer");
		secondLibrary.borrowBook("The Pragmatic Programmer");
		System.out.println();

		// Print the titles of all available books from both libraries
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks();
		System.out.println();

		// Return TThe Pragmatic Programmer to the first library
		System.out.println("Returning The Pragmatic Programmer:");
		firstLibrary.returnBook("The Pragmatic Programmer");
		System.out.println();

		// Print the titles of available from the first library
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
	}
} 
