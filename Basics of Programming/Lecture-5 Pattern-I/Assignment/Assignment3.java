import java.util.*;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read number of rows (N)

        for (int i = 1; i <= n; i++) {
            int num = i;

            for (int j = 1; j <= n; j++) {
                System.out.print(num + " ");

                num++; // Go to next number

                if (num > n) {
                    num = 1; // Wrap around to 1 after N
                }
            }

            System.out.println(); // Move to next row
        }

        sc.close();
    }
}
