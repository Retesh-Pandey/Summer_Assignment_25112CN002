    public class CharacterPyramid {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
      
            for (char ch = (char)('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}


