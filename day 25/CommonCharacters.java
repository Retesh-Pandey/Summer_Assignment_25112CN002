import java.util.Scanner;
class CommonCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        // Boolean arrays to mark presence of characters
        boolean[] present1 = new boolean[256];
        boolean[] present2 = new boolean[256];

        // Mark characters of first string
        for (char c : s1.toCharArray()) {
            present1[c] = true;
        }

        // Mark characters of second string
        for (char c : s2.toCharArray()) {
            present2[c] = true;
        }

        System.out.println("Common characters:");
        for (int i = 0; i < 256; i++) {
            if (present1[i] && present2[i]) {
                System.out.print((char)i + " ");
            }
        }

        sc.close();
    }
}
