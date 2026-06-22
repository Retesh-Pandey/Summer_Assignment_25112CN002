import java.util.Scanner;

class Salary {
    int empId;
    String name;
    double basicPay;
    double allowances;
    double deductions;

    Salary(int empId, String name, double basicPay, double allowances, double deductions) {
        this.empId = empId;
        this.name = name;
        this.basicPay = basicPay;
        this.allowances = allowances;
        this.deductions = deductions;
    }

    double netSalary() {
        return basicPay + allowances - deductions;
    }

    void display() {
        System.out.println("ID: " + empId + ", Name: " + name +
                           ", Basic Pay: " + basicPay +
                           ", Allowances: " + allowances +
                           ", Deductions: " + deductions +
                           ", Net Salary: " + netSalary());
    }
}

public class SalaryManagementSystem {
    static Salary[] records = new Salary[100]; // fixed size for simplicity
    static int count = 0;

    public static void addRecord(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Basic Pay: ");
        double basic = sc.nextDouble();
        System.out.print("Enter Allowances: ");
        double allowances = sc.nextDouble();
        System.out.print("Enter Deductions: ");
        double deductions = sc.nextDouble();

        records[count++] = new Salary(id, name, basic, allowances, deductions);
        System.out.println("Salary record added successfully!");
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
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (records[i].empId == id) {
                records[i].display();
                return;
            }
        }
        System.out.println("Record not found.");
    }

    public static void updateRecord(Scanner sc) {
        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (records[i].empId == id) {
                System.out.print("Enter new Basic Pay: ");
                records[i].basicPay = sc.nextDouble();
                System.out.print("Enter new Allowances: ");
                records[i].allowances = sc.nextDouble();
                System.out.print("Enter new Deductions: ");
                records[i].deductions = sc.nextDouble();
                System.out.println("Record updated!");
                return;
            }
        }
        System.out.println("Record not found.");
    }

    public static void deleteRecord(Scanner sc) {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (records[i].empId == id) {
                for (int j = i; j < count - 1; j++) {
                    records[j] = records[j + 1];
                }
                count--;
                System.out.println("Record deleted!");
                return;
            }
        }
        System.out.println("Record not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Salary Management System ---");
            System.out.println("1. Add Salary Record");
            System.out.println("2. Display All Records");
            System.out.println("3. Search Record");
            System.out.println("4. Update Record");
            System.out.println("5. Delete Record");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addRecord(sc); break;
                case 2: displayAll(); break;
                case 3: searchRecord(sc); break;
                case 4: updateRecord(sc); break;
                case 5: deleteRecord(sc); break;
                case 6: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 6);
        sc.close();
    }
}
