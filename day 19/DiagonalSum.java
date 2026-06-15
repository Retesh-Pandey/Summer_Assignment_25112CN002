import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] A = new int[n][n];

        // Input matrix
        System.out.println("Enter elements of Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int primarySum = 0, secondarySum = 0;

        // Calculate diagonal sums
        for (int i = 0; i < n; i++) {
            primarySum += A[i][i];           // Primary diagonal
            secondarySum += A[i][n - i - 1]; // Secondary diagonal
        }

        // Display results
        System.out.println("Primary Diagonal Sum = " + primarySum);
        System.out.println("Secondary Diagonal Sum = " + secondarySum);
    }
}
