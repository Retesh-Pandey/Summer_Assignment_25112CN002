import java.util.Scanner;

class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merge arrays
        int[] merged = new int[n1 + n2];
        int k = 0;

        for (int i = 0; i < n1; i++) {
            merged[k++] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            merged[k++] = arr2[i];
        }

        // Output merged array
        System.out.println("Merged array:");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }

        sc.close();
    }
}
