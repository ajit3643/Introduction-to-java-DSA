import java.util.*;

public class Number_Pattern1 {
    public static void main(String[] args) {
        System.out.println("Enter any number :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= number; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}
