
// Hours glass pattern!
import java.util.*;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {

            // space
            int j = 1;
            while (j <= i - 1) {
                System.out.print(" ");
                j++;
            }
            // number from i to n
            j = i;
            while (j <= n) {
                System.out.print(j);
                System.out.print(" ");
                j++;

            }
            System.out.println();
            i++;
        }

        i = n - 1;
        while (i >= 1) {

            // space
            int j = 1;
            while (j <= i - 1) {
                System.out.print(" ");
                j++;
            }
            // number from i to n
            j = i;
            while (j <= n) {
                System.out.print(j);
                System.out.print(" ");
                j++;

            }
            System.out.println();
            i--;
        }

        sc.close();

    }
}
