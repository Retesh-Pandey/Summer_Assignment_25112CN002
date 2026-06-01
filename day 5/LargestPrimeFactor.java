import java.util.Scanner;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int largest = -1;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                largest = i;
                n = n / i;
            }
        }
        System.out.println("Largest prime factor is: " + largest);
        sc.close();
    }
}
