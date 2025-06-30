import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();

        while (S <= E) {
            int celsius = (int) ((S - 32) * 5.0 / 9);
            System.out.println(S + " " + celsius);
            S += W;
        }

        sc.close();
    }
}
