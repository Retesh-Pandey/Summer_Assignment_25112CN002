import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int n = start; n <= end; n++) {
            int temp = n, sum = 0, digits = 0;

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

            if (sum == n) {
                System.out.println(n);
            }
        }
        sc.close();
    }
}

