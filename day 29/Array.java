import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50];  // fixed size array
        int n = 0;                // current number of elements
        int choice;

        do {
            System.out.println("\n--- Array Operations Menu ---");
            System.out.println("1. Insert element");
            System.out.println("2. Delete element");
            System.out.println("3. Display array");
            System.out.println("4. Search element");
            System.out.println("5. Sort array");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Insert
                    if (n < arr.length) {
                        System.out.print("Enter element to insert: ");
                        int elem = sc.nextInt();
                        arr[n] = elem;
                        n++;
                        System.out.println("Element inserted.");
                    } else {
                        System.out.println("Array is full!");
                    }
                    break;

                case 2: // Delete
                    System.out.print("Enter element to delete: ");
                    int del = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == del) {
                            for (int j = i; j < n - 1; j++) {
                                arr[j] = arr[j + 1];
                            }
                            n--;
                            found = true;
                            System.out.println("Element deleted.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Element not found!");
                    }
                    break;

                case 3: // Display
                    System.out.print("Array elements: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 4: // Search
                    System.out.print("Enter element to search: ");
                    int search = sc.nextInt();
                    found = false;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == search) {
                            System.out.println("Element found at position " + (i + 1));
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Element not found!");
                    }
                    break;

                case 5: // Sort
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (arr[i] > arr[j]) {
                                int temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                            }
                        }
                    }
                    System.out.println("Array sorted in ascending order.");
                    break;

                case 6: // Exit
                    System.out.println("Exiting program... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}
