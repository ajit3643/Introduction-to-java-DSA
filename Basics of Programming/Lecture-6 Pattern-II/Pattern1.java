
import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                char jthChar = (char) ('A' + j - 1);
                System.out.print(jthChar);
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
        s.close();
    }
}
