import java.util.ArrayList;
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

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name +
               ", Department: " + department + ", Salary: " + salary;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Employee Management Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: // Add Employee
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    employees.add(new Employee(id, name, dept, salary));
                    System.out.println("Employee added successfully!");
                    break;

                case 2: // Display Employees
                    if (employees.isEmpty()) {
                        System.out.println("No employees found!");
                    } else {
                        System.out.println("Employee Records:");
                        for (Employee e : employees) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 3: // Search Employee
                    System.out.print("Enter Employee ID to search: ");
                    id = sc.nextInt();
                    boolean found = false;
                    for (Employee e : employees) {
                        if (e.id == id) {
                            System.out.println("Employee found: " + e);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found!");
                    }
                    break;

                case 4: // Update Employee
                    System.out.print("Enter Employee ID to update: ");
                    id = sc.nextInt();
                    found = false;
                    for (Employee e : employees) {
                        if (e.id == id) {
                            sc.nextLine();
                            System.out.print("Enter new Department: ");
                            e.department = sc.nextLine();
                            System.out.print("Enter new Salary: ");
                            e.salary = sc.nextDouble();
                            System.out.println("Employee updated successfully!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found!");
                    }
                    break;

                case 5: // Delete Employee
                    System.out.print("Enter Employee ID to delete: ");
                    id = sc.nextInt();
                    boolean removed = employees.removeIf(e -> e.id == id);
                    if (removed) {
                        System.out.println("Employee deleted successfully!");
                    } else {
                        System.out.println("Employee not found!");
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
