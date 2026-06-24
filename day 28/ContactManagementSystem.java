import java.util.Scanner;

class Contact {
    int contactId;
    String name;
    String phone;
    String email;

    Contact(int contactId, String name, String phone, String email) {
        this.contactId = contactId;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    void display() {
        System.out.println("ID: " + contactId +
                           ", Name: " + name +
                           ", Phone: " + phone +
                           ", Email: " + email);
    }
}

public class ContactManagementSystem {
    static Contact[] contacts = new Contact[100]; // max 100 contacts
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    // Add new contact
    static void addContact() {
        System.out.print("Enter Contact ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        contacts[count++] = new Contact(id, name, phone, email);
        System.out.println("Contact added successfully!\n");
    }

    // Display all contacts
    static void displayContacts() {
        if (count == 0) {
            System.out.println("No contacts available.\n");
            return;
        }
        System.out.println("=== Contact List ===");
        for (int i = 0; i < count; i++) {
            contacts[i].display();
        }
        System.out.println();
    }

    // Search contact by ID
    static void searchContact() {
        System.out.print("Enter Contact ID to search: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (contacts[i].contactId == id) {
                contacts[i].display();
                return;
            }
        }
        System.out.println("Contact not found.\n");
    }

    // Update contact
    static void updateContact() {
        System.out.print("Enter Contact ID to update: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        for (int i = 0; i < count; i++) {
            if (contacts[i].contactId == id) {
                System.out.print("Enter New Name: ");
                contacts[i].name = sc.nextLine();
                System.out.print("Enter New Phone: ");
                contacts[i].phone = sc.nextLine();
                System.out.print("Enter New Email: ");
                contacts[i].email = sc.nextLine();
                System.out.println("Contact updated successfully!\n");
                return;
            }
        }
        System.out.println("Contact not found.\n");
    }

    // Delete contact
    static void deleteContact() {
        System.out.print("Enter Contact ID to delete: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (contacts[i].contactId == id) {
                // Shift remaining contacts left
                for (int j = i; j < count - 1; j++) {
                    contacts[j] = contacts[j + 1];
                }
                count--;
                System.out.println("Contact deleted successfully!\n");
                return;
            }
        }
        System.out.println("Contact not found.\n");
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("=== Contact Management System ===");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addContact(); break;
                case 2: displayContacts(); break;
                case 3: searchContact(); break;
                case 4: updateContact(); break;
                case 5: deleteContact(); break;
                case 6: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!\n");
            }
        } while (choice != 6);
    }
}
