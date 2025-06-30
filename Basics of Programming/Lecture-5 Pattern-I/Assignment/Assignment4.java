import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }

            // Print stars with spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
                if (j < n - i - 1) {
                    System.out.print(" ");
                }
            }

            // Move to next line
            System.out.println();
        }

        sc.close();
    }
}
