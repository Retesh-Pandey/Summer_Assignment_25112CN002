import java.util.Scanner;
class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input size of array
        System.out.print("Enter the size of array (n): ");
        int n = sc.nextInt();

        // Step 2: Input array elements
        int[] arr = new int[n - 1]; // one number is missing
        System.out.println("Enter " + (n - 1) + " elements:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Expected sum of 1 to n
        int expectedSum = n * (n + 1) / 2;

        // Step 4: Actual sum of given elements
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // Step 5: Missing number
        int missing = expectedSum - actualSum;
        System.out.println("Missing number is: " + missing);

        sc.close();
    }
}
