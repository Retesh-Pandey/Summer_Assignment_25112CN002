import java.util.Scanner;

class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        int binary[] = new int[40];                                   // array to store binary digits
        int index = 0;
        // repeatedly divide by 2 and store remainders
        while (num > 0) {
            binary[index] = num % 2;
            num = num / 2;
            index++;
        }

        System.out.print("Binary number: ");
        // print digits in reverse order
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}
