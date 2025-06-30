import java.util.*;

public class Multiply {
    public static void main(String[] args) {
        System.out.println("Enter any positive number you want to multiply:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 0 && number <= 10000) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + number * i);
            }
        }

        sc.close();
    }
}
