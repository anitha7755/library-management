package com.lbrce.library;

public class library {
	    private int id;
	    private String title;
	    private String author;
	    private boolean isIssued;

	    public void Book(int id, String title, String author) {
	        this.id = id;
	        this.title = title;
	        this.author = author;
	        this.isIssued = false;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public boolean isIssued() {
	        return isIssued;
	    }

	    public void issueBook() {
	        if (!isIssued) {
	            isIssued = true;
	            System.out.println("Book issued successfully.");
	        } else {
	            System.out.println("Book is already issued.");
	        }
	    }

	    public void returnBook() {
	        if (isIssued) {
	            isIssued = false;
	            System.out.println("Book returned successfully.");
	        } else {
	            System.out.println("Book was not issued.");
	        }
	    }
	}

	class Library {
	    private ArrayList<Book> books = new ArrayList<>();

	    public void addBook(Book book) {
	        books.add(book);
	        System.out.println("Book added successfully.");
	    }

	    public void viewBooks() {
	        if (books.isEmpty()) {
	            System.out.println("No books in the library.");
	        } else {
	            for (Book book : books) {
	                System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() +
	                        ", Author: " + book.getAuthor() + ", Issued: " + (book.isIssued() ? "Yes" : "No"));
	            }
	        }
	    }

	    public Book findBookById(int id) {
	        for (Book book : books) {
	            if (book.getId() == id) {
	                return book;
	            }
	        }
	        return null;
	    }
	}

//	public class LibraryManagementSystem {
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//	        Library library = new Library();
//	        int choice;
//
//	        do {
//	            System.out.println("\nLibrary Management System");
//	            System.out.println("1. Add Book");
//	            System.out.println("2. View Books");
//	            System.out.println("3. Issue Book");
//	            System.out.println("4. Return Book");
//	            System.out.println("5. Exit");
//	            System.out.print("Enter your choice: ");
//	            choice = scanner.nextInt();
//
//	            switch (choice) {
//	                case 1:
//	                    System.out.print("Enter book ID: ");
//	                    int id = scanner.nextInt();
//	                    scanner.nextLine(); // Consume newline
//	                    System.out.print("Enter book title: ");
//	                    String title = scanner.nextLine();
//	                    System.out.print("Enter book author: ");
//	                    String author = scanner.nextLine();
//	                    library.addBook(new Book(id, title, author));
//	                    break;
//	                case 2:
//	                    library.viewBooks();
//	                    break;
//	                case 3:
//	                    System.out.print("Enter book ID to issue: ");
//	                    int issueId = scanner.nextInt();
//	                    Book issueBook = library.findBookById(issueId);
//	                    if (issueBook != null) {
//	                        issueBook.issueBook();
//	                    } else {
//	                        System.out.println("Book not found.");
//	                    }
//	                    break;
//	                case 4:
//	                    System.out.print("Enter book ID to return: ");
//	                    int returnId = scanner.nextInt();
//	                    Book returnBook = library.findBookById(returnId);
//	                    if (returnBook != null) {
//	                        returnBook.returnBook();
//	                    } else {
//	                        System.out.println("Book not found.");
//	                    }
//	                    break;
//	                case 5:
//	                    System.out.println("Exiting the system.");
//	                    break;
//	                default:
//	                    System.out.println("Invalid choice, please try again.");
//	            }
//	        } while (choice != 5);
//
//	        scanner.close();
//	    }
//	}

}
