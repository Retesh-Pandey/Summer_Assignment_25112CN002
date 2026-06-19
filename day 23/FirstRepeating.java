import java.util.Scanner;
public class FirstRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);

            // Check if c appeared before
           
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == c) {
                    System.out.println("First repeating character: " + c);
                    return;
                }
            }
        }

        System.out.println("No repeating character found.");
    }
}

