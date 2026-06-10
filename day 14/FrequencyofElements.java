import java.util.Scanner;

class FrequencyOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for size of the array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Create array of given size
        int[] arr = new int[n];

        // Take array input from user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Ask user for the element to check frequency
        System.out.print("Enter element to find frequency: ");
        int key = sc.nextInt();

        // Counter to store frequency
        int count = 0;

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++; // Increment counter if match found
            }
        }

        // Display result
        System.out.println("Frequency of " + key + " = " + count);
    }
}
