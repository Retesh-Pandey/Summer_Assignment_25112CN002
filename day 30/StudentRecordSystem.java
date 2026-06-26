import java.util.Scanner;

public class StudentRecordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays to store student data
        int[] rollNo = new int[50];
        String[] name = new String[50];
        String[] course = new String[50];
        int[] marks = new int[50];
        int n = 0; // number of students
        int choice;

        do {
            System.out.println("\n--- Student Record System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: // Add Student
                    if (n < rollNo.length) {
                        System.out.print("Enter Roll No: ");
                        rollNo[n] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        name[n] = sc.nextLine();
                        System.out.print("Enter Course: ");
                        course[n] = sc.nextLine();
                        System.out.print("Enter Marks: ");
                        marks[n] = sc.nextInt();
                        n++;
                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Record limit reached!");
                    }
                    break;

                case 2: // Display Students
                    if (n == 0) {
                        System.out.println("No records found!");
                    } else {
                        System.out.println("Student Records:");
                        for (int i = 0; i < n; i++) {
                            System.out.println("Roll No: " + rollNo[i] +
                                               ", Name: " + name[i] +
                                               ", Course: " + course[i] +
                                               ", Marks: " + marks[i]);
                        }
                    }
                    break;

                case 3: // Search Student
                    System.out.print("Enter Roll No to search: ");
                    int r = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (rollNo[i] == r) {
                            System.out.println("Record Found: Roll No: " + rollNo[i] +
                                               ", Name: " + name[i] +
                                               ", Course: " + course[i] +
                                               ", Marks: " + marks[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4: // Update Student
                    System.out.print("Enter Roll No to update: ");
                    r = sc.nextInt();
                    found = false;
                    for (int i = 0; i < n; i++) {
                        if (rollNo[i] == r) {
                            System.out.print("Enter new Marks: ");
                            marks[i] = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter new Course: ");
                            course[i] = sc.nextLine();
                            System.out.println("Record updated successfully!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 5: // Delete Student
                    System.out.print("Enter Roll No to delete: ");
                    r = sc.nextInt();
                    found = false;
                    for (int i = 0; i < n; i++) {
                        if (rollNo[i] == r) {
                            for (int j = i; j < n - 1; j++) {
                                rollNo[j] = rollNo[j + 1];
                                name[j] = name[j + 1];
                                course[j] = course[j + 1];
                                marks[j] = marks[j + 1];
                            }
                            n--;
                            System.out.println("Record deleted successfully!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found!");
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
