import java.util.*;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = number; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Second Approach");
        System.out.println();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(number - j + 1);
            }
            System.out.println();
        }
        sc.close();

    }
}
