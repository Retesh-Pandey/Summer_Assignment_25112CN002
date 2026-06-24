import java.util.Scanner;

class Ticket {
    int ticketId;
    String passengerName;
    String destination;
    boolean booked;

    Ticket(int ticketId, String passengerName, String destination) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.destination = destination;
        this.booked = true; // new ticket is booked by default
    }

    void display() {
        System.out.println("Ticket ID: " + ticketId +
                           ", Passenger: " + passengerName +
                           ", Destination: " + destination +
                           ", Status: " + (booked ? "Booked" : "Cancelled"));
    }
}

public class TicketBookingSystem {
    static Ticket[] tickets = new Ticket[100]; // max 100 tickets
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    // Book a new ticket
    static void bookTicket() {
        System.out.print("Enter Ticket ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Destination: ");
        String dest = sc.nextLine();

        tickets[count++] = new Ticket(id, name, dest);
        System.out.println("Ticket booked successfully!\n");
    }

    // Display all tickets
    static void displayTickets() {
        if (count == 0) {
            System.out.println("No tickets booked.\n");
            return;
        }
        System.out.println("=== Ticket List ===");
        for (int i = 0; i < count; i++) {
            tickets[i].display();
        }
        System.out.println();
    }

    // Search ticket by ID
    static void searchTicket() {
        System.out.print("Enter Ticket ID to search: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (tickets[i].ticketId == id) {
                tickets[i].display();
                return;
            }
        }
        System.out.println("Ticket not found.\n");
    }

    // Cancel a ticket
    static void cancelTicket() {
        System.out.print("Enter Ticket ID to cancel: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (tickets[i].ticketId == id) {
                if (tickets[i].booked) {
                    tickets[i].booked = false;
                    System.out.println("Ticket cancelled successfully!\n");
                } else {
                    System.out.println("Ticket already cancelled.\n");
                }
                return;
            }
        }
        System.out.println("Ticket not found.\n");
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("=== Ticket Booking System ===");
            System.out.println("1. Book Ticket");
            System.out.println("2. Display Tickets");
            System.out.println("3. Search Ticket");
            System.out.println("4. Cancel Ticket");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: bookTicket(); break;
                case 2: displayTickets(); break;
                case 3: searchTicket(); break;
                case 4: cancelTicket(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!\n");
            }
        } while (choice != 5);
    }
}
