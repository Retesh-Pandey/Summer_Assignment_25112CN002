import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        double factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        // Print the result
        System.out.println("Factorial of " + num + " is: " + factorial);

        sc.close();
    }
}
