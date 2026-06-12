import java.util.Scanner;

class UnionOfArrays {
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

        // Union logic
        int[] union = new int[n1 + n2];
        int k = 0;

        // Copy first array
        for (int i = 0; i < n1; i++) {
            union[k++] = arr1[i];
        }

        // Add elements from second array if not already present
        for (int i = 0; i < n2; i++) {
            boolean exists = false;
            for (int j = 0; j < k; j++) {
                if (arr2[i] == union[j]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                union[k++] = arr2[i];
            }
        }

        // Print union
        System.out.println("Union of arrays:");
        for (int i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }

        sc.close();
    }
}
