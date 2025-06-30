import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any natural number!");
        int number = sc.nextInt();

        // int sum = (number * (number + 1) / 2);
        // System.out.println("Sum of first " + number + " Natural numbers " + sum);

        // int sum = 0;
        // for(int i = 1; i <= number; i++) {
        // sum = sum + i;
        // }
        // System.out.println(sum);

        // Q. print sum of all even number till N.

        int sum = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
