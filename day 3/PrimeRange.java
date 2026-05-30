import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int n = start; n <= end; n++) {
            int flag = 0;
            if (n <= 1) flag = 1;
            else {
                for (int i = 2; i <= n / 2; i++) {
                    if (n % i == 0) {
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 0) System.out.println(n);
        }
        sc.close();
    }
}
