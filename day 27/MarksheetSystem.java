import java.util.Scanner;

class Marksheet {
    int rollNo;
    String name;
    int[] marks;
    int total;
    double percentage;
    String grade;

    Marksheet(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        calculate();
    }

    void calculate() {
        total = 0;
        for (int m : marks) {
            total += m;
        }
        percentage = (double) total / marks.length;
        if (percentage >= 60) grade = "First Division";
        else if (percentage >= 45) grade = "Second Division";
        else grade = "Fail";
    }

    void display() {
        System.out.println("\n--- Marksheet ---");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i+1) + " Marks: " + marks[i]);
        }
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

public class MarksheetSystem {
    static Marksheet[] records = new Marksheet[100];
    static int count = 0;

    public static void addRecord(Scanner sc) {
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i+1) + ": ");
            marks[i] = sc.nextInt();
        }
        records[count++] = new Marksheet(rollNo, name, marks);
        System.out.println("Marksheet added successfully!");
    }

    public static void displayAll() {
        if (count == 0) {
            System.out.println("No records found.");
            return;
        }
        for (int i = 0; i < count; i++) {
            records[i].display();
        }
    }

    public static void searchRecord(Scanner sc) {
        System.out.print("Enter Roll No to search: ");
        int rollNo = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (records[i].rollNo == rollNo) {
                records[i].display();
                return;
            }
        }
        System.out.println("Record not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Marksheet Generation System ---");
            System.out.println("1. Add Marksheet");
            System.out.println("2. Display All Marksheets");
            System.out.println("3. Search Marksheet");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addRecord(sc); break;
                case 2: displayAll(); break;
                case 3: searchRecord(sc); break;
                case 4: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 4);
        sc.close();
    }
}
