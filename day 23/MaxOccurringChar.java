import java.util.Scanner;

public class MaxOccurringChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int n = str.length();

        char maxChar = '\0';
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            int count = 0;

            // Count occurrences of c
            for (int j = 0; j < n; j++) {
                if (str.charAt(j) == c) {
                    count++;
                }
            }

            // Update maximum
            if (count > maxCount) {
                maxCount = count;
                maxChar = c;
            }
        }

        if (maxCount > 0)
            System.out.println("Maximum occurring character: " + maxChar + " (appears " + maxCount + " times)");
                               
        else
            System.out.println("String is empty.");
    }
}
