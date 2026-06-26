import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String title;
    String author;
    String publisher;
    boolean available;

    Book(int id, String title, String author, String publisher, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.available = available;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title +
               ", Author: " + author + ", Publisher: " + publisher +
               ", Available: " + (available ? "Yes" : "No");
    }
}

public class MiniLibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Mini Library System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book Availability");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: // Add Book
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Publisher: ");
                    String publisher = sc.nextLine();
                    System.out.print("Is Available (true/false): ");
                    boolean available = sc.nextBoolean();
                    library.add(new Book(id, title, author, publisher, available));
                    System.out.println("Book added successfully!");
                    break;

                case 2: // Display Books
                    if (library.isEmpty()) {
                        System.out.println("Library is empty!");
                    } else {
                        System.out.println("Books in Library:");
                        for (Book b : library) {
                            System.out.println(b);
                        }
                    }
                    break;

                case 3: // Search Book
                    System.out.print("Enter Book ID to search: ");
                    id = sc.nextInt();
                    boolean found = false;
                    for (Book b : library) {
                        if (b.id == id) {
                            System.out.println("Book found: " + b);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found!");
                    }
                    break;

                case 4: // Update Availability
                    System.out.print("Enter Book ID to update: ");
                    id = sc.nextInt();
                    found = false;
                    for (Book b : library) {
                        if (b.id == id) {
                            System.out.print("Enter new availability (true/false): ");
                            b.available = sc.nextBoolean();
                            System.out.println("Book availability updated!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found!");
                    }
                    break;

                case 5: // Delete Book
                    System.out.print("Enter Book ID to delete: ");
                    id = sc.nextInt();
                    boolean removed = library.removeIf(b -> b.id == id);
                    if (removed) {
                        System.out.println("Book deleted successfully!");
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 6: // Exit
                    System.out.println("Exiting system... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}
