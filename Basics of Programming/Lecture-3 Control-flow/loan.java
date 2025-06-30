
import java.util.*;

public class loan {
    public static void main(String[] args) {
        // write your code logic ...

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        double income = sc.nextDouble();
        boolean outstandingLoans = sc.nextBoolean();

        if (age >= 18 && income >= 2000 && !outstandingLoans) {
            System.out.println("You are eligible for the loan.");
        } else {
            System.out.println("You are not eligible for the loan.");
        }
        sc.close();
    }
}
