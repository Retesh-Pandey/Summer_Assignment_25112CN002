import java.util.Scanner;
public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
            
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            int count = 0;

            // Check occurrences of c
            for (int j = 0; j < n; j++) {
                if (str.charAt(j) == c) {
                    count++;
                }
            }

            // If unique, print and stop
            if (count == 1) {
                System.out.println("First non-repeating character: " + c);
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}
