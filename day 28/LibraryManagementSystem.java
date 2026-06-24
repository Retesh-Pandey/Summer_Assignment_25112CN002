import java.util.Scanner;

class Book {
    int id;
    String title;
    String author;
    boolean available;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true; // new books are available by default
    }
}

public class LibraryManagementSystem {
    static Book[] library = new Book[100]; // max 100 books
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    // Add a new book
    static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        library[count++] = new Book(id, title, author);
        System.out.println("Book added successfully!\n");
    }

    // Display all books
    static void displayBooks() {
        if (count == 0) {
            System.out.println("No books in library.\n");
            return;
        }
        System.out.println("Library Books:");
        for (int i = 0; i < count; i++) {
            Book b = library[i];
            System.out.println("ID: " + b.id + ", Title: " + b.title +
                               ", Author: " + b.author +
                               ", Available: " + b.available);
        }
        System.out.println();
    }

    // Search book by ID
    static void searchBook() {
        System.out.print("Enter Book ID to search: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (library[i].id == id) {
                Book b = library[i];
                System.out.println("Found: " + b.title + " by " + b.author +
                                   " (Available: " + b.available + ")");
                return;
            }
        }
        System.out.println("Book not found.\n");
    }

    // Issue a book
    static void issueBook() {
        System.out.print("Enter Book ID to issue: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (library[i].id == id) {
                if (library[i].available) {
                    library[i].available = false;
                    System.out.println("Book issued successfully!\n");
                } else {
                    System.out.println("Book already issued.\n");
                }
                return;
            }
        }
        System.out.println("Book not found.\n");
    }

    // Return a book
    static void returnBook() {
        System.out.print("Enter Book ID to return: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (library[i].id == id) {
                if (!library[i].available) {
                    library[i].available = true;
                    System.out.println("Book returned successfully!\n");
                } else {
                    System.out.println("Book was not issued.\n");
                }
                return;
            }
        }
        System.out.println("Book not found.\n");
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addBook(); break;
                case 2: displayBooks(); break;
                case 3: searchBook(); break;
                case 4: issueBook(); break;
                case 5: returnBook(); break;
                case 6: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!\n");
            }
        } while (choice != 6);
    }
}
