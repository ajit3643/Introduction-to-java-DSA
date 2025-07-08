import java.util.*;

public class N_choose_R {

    public static int factorial(int num) {

        int fact = 1;
        for (int i = num; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        sc.close();

        if (n < 0 || r < 0) {
            System.out.println("Not valid number");
            return;
        }

        int factN = factorial(n);
        int factR = factorial(r);
        int factNR = factorial(n - r);

        int ncr = factN / (factR * factNR);
        System.out.println(ncr);

    }
}
