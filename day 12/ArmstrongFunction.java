import java.util.Scanner;

public class ArmstrongFunction {

    static boolean isArmstrong(int n) {
        int temp = n, sum = 0, digits = 0;

        // Count digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        while (temp > 0) {
            int r = temp % 10;
            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power *= r;
            }
            sum += power;
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        sc.close();
    }
}
