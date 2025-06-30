import java.util.*;

public class Conditionals {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner sc = new Scanner(System.in);
        // if statement

        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close();

    }

}
