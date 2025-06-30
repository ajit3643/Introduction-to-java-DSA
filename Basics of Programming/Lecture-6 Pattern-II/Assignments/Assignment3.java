import java.util.*;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Upper half including middle
        for (int i = 1; i <= N; i += 2) {
            int spaces = (N - i) / 2;

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int star = 0; star < i; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = N - 2; i >= 1; i -= 2) {
            int spaces = (N - i) / 2;

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int star = 0; star < i; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
        sc.close();
    }

}
