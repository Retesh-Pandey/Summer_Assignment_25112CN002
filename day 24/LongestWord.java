import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        int maxLen = 0;
        String longestWord = "";
        int currentLen = 0;
        String currentWord = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                currentLen++;
                currentWord += ch; 
                
                // build word manually
            }
             else {
                if (currentLen > maxLen) {
                    maxLen = currentLen;
                    longestWord = currentWord;
                }
                currentLen = 0;
                currentWord = "";
            }
        }

        // Check last word (in case sentence doesn’t end with space)
        
        if (currentLen > maxLen) {
            maxLen = currentLen;
            longestWord = currentWord;
        }

        System.out.println("Longest word: " + longestWord);
        sc.close();
    }
}
