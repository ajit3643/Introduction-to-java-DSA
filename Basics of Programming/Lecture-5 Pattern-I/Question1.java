import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Enter a number to print its square pattern:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

        sc.close();
    }

}
