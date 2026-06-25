import java.util.Scanner;

public class MenuDrivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- String Operations Menu ---");
            System.out.println("1. Find length of string");
            System.out.println("2. Reverse string");
            System.out.println("3. Concatenate two strings");
            System.out.println("4. Compare two strings");
            System.out.println("5. Convert to uppercase");
            System.out.println("6. Check palindrome");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: // Length
                    System.out.print("Enter a string: ");
                    String s1 = sc.nextLine();
                    System.out.println("Length = " + s1.length());
                    break;

                case 2: // Reverse
                    System.out.print("Enter a string: ");
                    s1 = sc.nextLine();
                    String rev = new StringBuilder(s1).reverse().toString();
                    System.out.println("Reversed string = " + rev);
                    break;

                case 3: // Concatenate
                    System.out.print("Enter first string: ");
                    s1 = sc.nextLine();
                    System.out.print("Enter second string: ");
                    String s2 = sc.nextLine();
                    System.out.println("Concatenated string = " + s1 + s2);
                    break;

                case 4: // Compare
                    System.out.print("Enter first string: ");
                    s1 = sc.nextLine();
                    System.out.print("Enter second string: ");
                    s2 = sc.nextLine();
                    if (s1.equals(s2)) {
                        System.out.println("Strings are equal.");
                    } else {
                        System.out.println("Strings are not equal.");
                    }
                    break;

                case 5: // Uppercase
                    System.out.print("Enter a string: ");
                    s1 = sc.nextLine();
                    System.out.println("Uppercase string = " + s1.toUpperCase());
                    break;

                case 6: // Palindrome
                    System.out.print("Enter a string: ");
                    s1 = sc.nextLine();
                    rev = new StringBuilder(s1).reverse().toString();
                    if (s1.equals(rev)) {
                        System.out.println("String is a palindrome.");
                    } else {
                        System.out.println("String is not a palindrome.");
                    }
                    break;

                case 7: // Exit
                    System.out.println("Exiting program... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 7);

        sc.close();
    }
}
