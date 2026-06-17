import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If character is lowercase (a-z), convert to uppercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);  // ASCII difference between lowercase and uppercase
            }

            result += ch;
        }

        System.out.println("Uppercase string = " + result);
    }
}

