import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams");
            return;
        }

        int n = str1.length();
        boolean isAnagram = true;

        for (int i = 0; i < n; i++) {
            char c = str1.charAt(i);
            int count1 = 0;
            int count2 = 0;

            // Count occurrences in str1
            for (int j = 0; j < n; j++) {
                if (str1.charAt(j) == c)
                     count1++;
            }

            // Count occurrences in str2
            for (int j = 0; j < n; j++) {
                if (str2.charAt(j) == c)
                     count2++;
            }

            if (count1 != count2) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram)
            System.out.println("Strings are anagrams");
        else
            System.out.println("Not anagrams");
    }
}
