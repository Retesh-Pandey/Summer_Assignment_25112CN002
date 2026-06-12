import java.util.Scanner;

class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 2: Input target sum
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        // Step 3: Find pairs
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + target);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair with given sum found.");
        }

        sc.close();
    }
}
