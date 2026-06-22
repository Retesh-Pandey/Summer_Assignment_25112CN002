import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
}

public class StudentRecordSystem {
    static Student[] students = new Student[100]; // fixed size for simplicity
    static int count = 0;

    public static void addStudent(Scanner sc) {
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        students[count++] = new Student(rollNo, name, marks);
        System.out.println("Student added successfully!");
    }

    public static void displayAll() {
        if (count == 0) {
            System.out.println("No records found.");
            return;
        }
        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }

    public static void searchStudent(Scanner sc) {
        System.out.print("Enter Roll No to search: ");
        int rollNo = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (students[i].rollNo == rollNo) {
                students[i].display();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void updateStudent(Scanner sc) {
        System.out.print("Enter Roll No to update: ");
        int rollNo = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (students[i].rollNo == rollNo) {
                System.out.print("Enter new Marks: ");
                students[i].marks = sc.nextInt();
                System.out.println("Record updated!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void deleteStudent(Scanner sc) {
        System.out.print("Enter Roll No to delete: ");
        int rollNo = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (students[i].rollNo == rollNo) {
                // shift records left
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                count--;
                System.out.println("Record deleted!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Student Record Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(sc); break;
                case 2: displayAll(); break;
                case 3: searchStudent(sc); break;
                case 4: updateStudent(sc); break;
                case 5: deleteStudent(sc); break;
                case 6: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 6);
        sc.close();
    }
}
