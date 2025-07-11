import java.util.*;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print *
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
