import java.util.*;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {
            int start;

            if (i <= n) {
                start = n - i + 1;
            } else {
                start = i - n + 1;
            }

            for (int j = start; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        sc.close();
    }

}
