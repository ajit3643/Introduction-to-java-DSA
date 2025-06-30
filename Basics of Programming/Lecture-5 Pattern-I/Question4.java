import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // print space
            for (int s = 0; s <= n - i; s++) {
                System.out.print(" ");
            }
            // print number
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
