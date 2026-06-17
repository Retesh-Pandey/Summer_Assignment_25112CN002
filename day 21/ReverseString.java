import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = "";
        // reversing the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed string = " + reversed);
    }
}
