import java.util.Scanner;

class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse array
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest; // shift down
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        // Display result
        if (secondLargest == Integer.MIN_VALUE)
            System.out.println("No second largest element (array too small or all equal)");
        else
            System.out.println("Second largest element = " + secondLargest);
    }
}

