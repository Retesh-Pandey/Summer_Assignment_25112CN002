import java.util.Scanner;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size and array
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();

        // Move non-zero elements forward
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
             arr[idx++] = arr[i];
        }

        // Fill remaining positions with zeroes
        while (idx < n) 
           arr[idx++] = 0;

        // Output result
        for (int num : arr) 
            System.out.print(num + " ");
        sc.close();
    }
}
