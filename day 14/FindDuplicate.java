import java.util.Scanner;

class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Step 2: Input array elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Find duplicates
        System.out.println("Duplicate elements are:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; // avoid printing same duplicate multiple times
                }
            }
        }
    }
}

