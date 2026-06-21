import java.util.Scanner;

class SortWordsByLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of words
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] words = new String[n];
        System.out.println("Enter " + n + " words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        // Bubble sort by length
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    // swap
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        // Output sorted words
        System.out.println("Words sorted by length:");
        for (String word : words) {
            System.out.println(word);
        }

        sc.close();
    }
}
