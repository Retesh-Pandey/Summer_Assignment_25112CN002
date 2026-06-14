import java.util.Scanner;

public class DescendingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Step 2: Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Sort in descending order using bubble sort logic
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {  //  '<' for descending
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Step 4: Print sorted array
        System.out.println("Array in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
