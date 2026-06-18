import java.util.Scanner;;
public class CountWordsInSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        int wordCount = 0;
        boolean inWord = false;
         
        // iterate through each character in the sentence and count words

        for (char c : sentence.toCharArray()) {
            if (c == ' ' || c == '\t' || c == '\n') {
                if (inWord) {
                    wordCount++;
                    inWord = false;
                }
            } else {
                inWord = true;
            }
        }

        if (inWord) {
            wordCount++;
        }

        System.out.println("Number of words in the sentence: " + wordCount);
    }
}
