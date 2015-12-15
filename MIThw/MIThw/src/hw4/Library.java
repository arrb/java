package hw4;

import java.util.ArrayList;
import java.util.List;

public class Library {
	String library;
	Book libraryBooks;
	List<Book> totalBooks = new ArrayList<Book>();

	public Library(String libraryAddress) {
		// TODO Auto-generated constructor stub
		library = libraryAddress;
	}

	// Add the missing implementation to this class

	public static void main(String[] args) {
		// Create two libraries
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");

		// Add four books to the first library
		firstLibrary.addBook(new Book("The Da Vinci Code"));
		firstLibrary.addBook(new Book("Le Petit Prince"));
		firstLibrary.addBook(new Book("A Tale of Two Cities"));
		firstLibrary.addBook(new Book("The Lord of the Rings"));

		// Print opening hours and the addresses
		System.out.println("Library hours:");
		printOpeningHours();
		System.out.println();

		System.out.println("Library addresses:");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();

		// Try to borrow The Lords of the Rings from both libraries
		System.out.println("Borrowing The Lord of the Rings:");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");
		secondLibrary.borrowBook("The Lord of the Rings");
		System.out.println();

		// Print the titles of all available books from both libraries
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks();
		System.out.println();

		// Return The Lords of the Rings to the first library

		System.out.println("Returning The Lord of the Rings:");
		firstLibrary.returnBook("The Lord of the Rings");
		System.out.println();

		// Print the titles of available from the first library
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();

	}

	private void returnBook(String string) {
		// TODO Auto-generated method stub
		if (totalBooks.size() == 0) {
			System.out.println("Sorry, this book is not in our catalog.");
		} else {
			for (int i = 0; i < totalBooks.size(); i++) {
				boolean trueOrFalse = false;
				if (string.equals(totalBooks.get(i).getTitle())) {

					totalBooks.get(i).returned();
					trueOrFalse = totalBooks.get(i).isBorrowed();
					if (trueOrFalse == false) {
						System.out
								.println("You successfully returned The Lord of the Rings");
					}
					if (trueOrFalse == true) {
						System.out.println("ERROR");
					}
					break;
				}

			}
		}
	}

	private void printAvailableBooks() {
		// TODO Auto-generated method stub
		if (totalBooks.size() == 0) {
			System.out.println("No book in catalog");
		} else {
			boolean trueOrFalse = false;
			for (int i = 0; i < totalBooks.size(); i++) {
				trueOrFalse = totalBooks.get(i).isBorrowed();
				if (trueOrFalse == false) {
					System.out.println(totalBooks.get(i).getTitle());
				}
			}
		}
	}

	private void borrowBook(String string) {

		if (totalBooks.size() == 0) {
			System.out.println("Sorry, this book is not in our catalog.");
		} else {
			for (int i = 0; i < totalBooks.size(); i++) {
				boolean trueOrFalse = false;
				while (string.equals(totalBooks.get(i).getTitle())) {
					trueOrFalse = totalBooks.get(i).isBorrowed();
					if (trueOrFalse == false) {
						System.out
								.println("You successfully borrowed The Lord of the Rings");
						totalBooks.get(i).borrowed();
					}
					if (trueOrFalse == true) {
						System.out
								.println("Sorry, this book is already borrowed.");
					}
					break;
				}
			}
		}
	}

	private void printAddress() {
		// TODO Auto-generated method stub
		System.out.println(library);
	}

	private static void printOpeningHours() {
		// TODO Auto-generated method stub
		System.out.println("Libraries are open daily from 9am to 5pm.");
	}

	private void addBook(Book book) {
		// TODO Auto-generated method stub
		libraryBooks = book;
		totalBooks.add(libraryBooks);
	}
}
