import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Step 2: Input sorted array elements
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Input target element
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        // Step 4: Binary Search logic
        int low = 0, high = n - 1, mid;
        boolean found = false;

        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found in array.");
        }

        sc.close();
    }
}

