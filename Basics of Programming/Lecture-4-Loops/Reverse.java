import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        /*
         * Problem statement
         * Write a program to generate the reverse of a given number N. Print the
         * corresponding reverse number.
         * 
         * Note : If a number has trailing zeros, then its reverse will not include
         * them. For e.g., reverse of 10400 will be 401 instead of 00401.
         * 
         */

        System.out.println("Enter a number to reverse:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reversed number: " + reverse);

        sc.close();

    }
}
