import java.util.*;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            char ch = (char) ('A' + N - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
        sc.close();
    }
}
