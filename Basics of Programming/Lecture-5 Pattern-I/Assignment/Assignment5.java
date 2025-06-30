import java.util.*;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i);
        }
        System.out.println();

        for (int i = 1; i <= n - 2; i++) {
            System.out.print("1");
            for (int j = 1; j <= n - 2; j++) {
                System.out.print(" ");
            }
            if (n >= 2) {
                System.out.print("2");
            }
            System.out.println();
        }

        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i);
            }
            System.out.println();
        }

        sc.close();
    }
}
