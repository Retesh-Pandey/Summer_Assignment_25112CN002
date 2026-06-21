import java.util.Scanner;

class SortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of names
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        // Sort names alphabetically using Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    // swap
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        // Output sorted names
        System.out.println("Names in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}
