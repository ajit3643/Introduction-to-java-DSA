import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();

        // Write your code here
        long i = 1;
        while (i <= n) {

            // space
            long j = 1;
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
            long j = 1;
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

        s.close();

    }
}
