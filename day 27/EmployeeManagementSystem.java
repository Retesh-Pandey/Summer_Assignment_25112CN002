import java.util.Scanner;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name +
                           ", Department: " + department +
                           ", Salary: " + salary);
    }
}

public class EmployeeManagementSystem {
    static Employee[] employees = new Employee[100]; // fixed size for simplicity
    static int count = 0;

    public static void addEmployee(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Department: ");
        String department = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        employees[count++] = new Employee(id, name, department, salary);
        System.out.println("Employee added successfully!");
    }

    public static void displayAll() {
        if (count == 0) {
            System.out.println("No records found.");
            return;
        }
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }

    public static void searchEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (employees[i].id == id) {
                employees[i].display();
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void updateEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (employees[i].id == id) {
                System.out.print("Enter new Salary: ");
                employees[i].salary = sc.nextDouble();
                System.out.println("Record updated!");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void deleteEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (employees[i].id == id) {
                // shift records left
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                count--;
                System.out.println("Record deleted!");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addEmployee(sc); break;
                case 2: displayAll(); break;
                case 3: searchEmployee(sc); break;
                case 4: updateEmployee(sc); break;
                case 5: deleteEmployee(sc); break;
                case 6: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 6);
        sc.close();
    }
}
