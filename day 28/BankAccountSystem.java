import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    void display() {
        System.out.println("Account No: " + accountNumber +
                           ", Holder: " + holderName +
                           ", Balance: " + balance);
    }
}

public class BankAccountSystem {
    static BankAccount[] accounts = new BankAccount[100];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    static void createAccount() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        accounts[count++] = new BankAccount(accNo, name, balance);
        System.out.println("Account created successfully!\n");
    }

    static BankAccount findAccount(int accNo) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].accountNumber == accNo) {
                return accounts[i];
            }
        }
        return null;
    }

    static void depositMoney() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        BankAccount acc = findAccount(accNo);
        if (acc != null) {
            System.out.print("Enter Amount to Deposit: ");
            double amt = sc.nextDouble();
            acc.deposit(amt);
        } else {
            System.out.println("Account not found.\n");
        }
    }

    static void withdrawMoney() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        BankAccount acc = findAccount(accNo);
        if (acc != null) {
            System.out.print("Enter Amount to Withdraw: ");
            double amt = sc.nextDouble();
            acc.withdraw(amt);
        } else {
            System.out.println("Account not found.\n");
        }
    }

    static void displayAccounts() {
        if (count == 0) {
            System.out.println("No accounts available.\n");
            return;
        }
        System.out.println("=== Bank Accounts ===");
        for (int i = 0; i < count; i++) {
            accounts[i].display();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("=== Bank Account System ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Display Accounts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: createAccount(); break;
                case 2: depositMoney(); break;
                case 3: withdrawMoney(); break;
                case 4: displayAccounts(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!\n");
            }
        } while (choice != 5);
    }
}
