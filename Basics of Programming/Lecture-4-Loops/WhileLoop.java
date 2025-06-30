import java.util.*;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(number * i);
            i++;
        }

        // Q. int x = 5;
        // int y = 5;
        // while ((x = 5) == y) {
        // System.out.println("Hello");
        // x++;
        // y++;
        // }

        // Q. int i = 0;
        // while (i < 10) {
        // i = i + 1;
        // System.out.print(i);
        // i = i + 1;
        // }

        // Q. Reverse a number using while loop
        // Input: 12345
        int num = sc.nextInt();
        while (num != 0) {
            System.out.println(num % 10);
            num = num / 10;
        }

        sc.close();
    }

}
