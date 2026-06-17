import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int count = 0;
        char[] chars = str.toCharArray();  // convert string to char array
        
        for (char ch : chars) {
            count++;
        }
        
        System.out.println("Length of the string = " + count);
    }
}
