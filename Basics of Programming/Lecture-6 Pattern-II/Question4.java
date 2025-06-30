import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Increasing numbers
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }

            // Decreasing numbers
            num = num - 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num);
                num--;
            }

            System.out.println();
        }
        sc.close();
    }
}
