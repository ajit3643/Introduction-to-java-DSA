
import java.util.Scanner;

public class Pattern2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            char p = (char) ('A' + i - 1);
            int j = 1;
            while (j <= n) {

                System.out.print(p);
                p = (char) (p + 1);
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
        s.close();
    }
}