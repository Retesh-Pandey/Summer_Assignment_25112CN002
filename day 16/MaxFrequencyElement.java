import java.util.Scanner;

class MaxFrequencyElement {
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

        // Step 2: Find maximum frequency element using nested loops
        int maxFreq = 0;
        int maxElement = arr[0];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxFreq) {
                maxFreq = count;
                maxElement = arr[i];
            }
        }

        // Step 3: Output result
        System.out.println("Element with maximum frequency: " + maxElement);
        System.out.println("Frequency: " + maxFreq);

        sc.close();
    }
}
