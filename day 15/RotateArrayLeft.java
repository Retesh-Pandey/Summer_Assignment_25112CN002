import java.util.Scanner;

public class RotateArrayLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        // Input number of rotations
        int k = sc.nextInt();
        k = k % n;  // normalize rotations

        // Create rotated array
        int[] rotated = new int[n];
        int idx = 0;

        // Copy elements from k to end
        for (int i = k; i < n; i++)
             rotated[idx++] = arr[i];

        // Copy first k elements
        for (int i = 0; i < k; i++)
             rotated[idx++] = arr[i];

        // Output rotated array
        for (int num : rotated) 
            System.out.print(num + " ");
        sc.close();
    }
}

