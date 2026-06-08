 import java.util.Scanner;

public class FibonacciFunction {

    // Function to print Fibonacci series up to n terms
    static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int num = sc.nextInt();

        printFibonacci(num);
        sc.close();
    }
}

