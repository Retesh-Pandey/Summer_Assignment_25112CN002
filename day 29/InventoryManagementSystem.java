import java.util.ArrayList;
import java.util.Scanner;

class Item {
    int id;
    String name;
    int quantity;
    double price;

    Item(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name +
               ", Quantity: " + quantity + ", Price: " + price;
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Item> inventory = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Inventory Management Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Delete Item");
            System.out.println("3. Update Item");
            System.out.println("4. Search Item");
            System.out.println("5. Display Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Add Item
                    System.out.print("Enter Item ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    inventory.add(new Item(id, name, qty, price));
                    System.out.println("Item added successfully!");
                    break;

                case 2: // Delete Item
                    System.out.print("Enter Item ID to delete: ");
                    id = sc.nextInt();
                    boolean removed = inventory.removeIf(item -> item.id == id);
                    if (removed) {
                        System.out.println("Item deleted successfully!");
                    } else {
                        System.out.println("Item not found!");
                    }
                    break;

                case 3: // Update Item
                    System.out.print("Enter Item ID to update: ");
                    id = sc.nextInt();
                    boolean updated = false;
                    for (Item item : inventory) {
                        if (item.id == id) {
                            System.out.print("Enter new Quantity: ");
                            item.quantity = sc.nextInt();
                            System.out.print("Enter new Price: ");
                            item.price = sc.nextDouble();
                            System.out.println("Item updated successfully!");
                            updated = true;
                            break;
                        }
                    }
                    if (!updated) {
                        System.out.println("Item not found!");
                    }
                    break;

                case 4: // Search Item
                    System.out.print("Enter Item ID to search: ");
                    id = sc.nextInt();
                    boolean found = false;
                    for (Item item : inventory) {
                        if (item.id == id) {
                            System.out.println("Item found: " + item);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Item not found!");
                    }
                    break;

                case 5: // Display Inventory
                    if (inventory.isEmpty()) {
                        System.out.println("Inventory is empty!");
                    } else {
                        System.out.println("Current Inventory:");
                        for (Item item : inventory) {
                            System.out.println(item);
                        }
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
