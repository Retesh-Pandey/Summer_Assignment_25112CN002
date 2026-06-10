import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define an array with some elements
        int[] arr = {10, 20, 30, 40, 50};

        // Ask the user for the element to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Variable to store the position if found
        int pos = -1;

        // Loop through the array elements one by one
        for (int i = 0; i < arr.length; i++) {
            // Compare current element with the key
            if (arr[i] == key) {
                pos = i; // Save the index if found
                break;   // Exit loop once element is found
            }
        }

        // Check if element was found or not
        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + pos);
    }
}
