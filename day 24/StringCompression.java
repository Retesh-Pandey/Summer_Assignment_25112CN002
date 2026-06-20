import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            
            // If next char is same, increase count

            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                
                // Append current char and its count

                compressed.append(str.charAt(i)).append(count);
                count = 1; // reset count
            }
        }

        System.out.println("Compressed string: " + compressed.toString());
        sc.close();
    }
}
