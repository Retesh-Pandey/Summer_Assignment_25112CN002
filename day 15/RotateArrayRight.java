import java.util.Scanner;

public class RotateArrayRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size and array
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();

        // Input number of rotations
        int k = sc.nextInt();
        k = k % n;  // normalize rotations

        // Create rotated array
        int[] rotated = new int[n];
        int idx = 0;

        // Copy last k elements to front
        for (int i = n - k; i < n; i++)
             rotated[idx++] = arr[i];

        // Copy remaining elements
        for (int i = 0; i < n - k; i++)
             rotated[idx++] = arr[i];

        // Output rotated array
        for (int num : rotated) 
            System.out.print(num + " ");
        sc.close();
    }
}

