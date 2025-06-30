// Q. Write a program to check if a number is prime or not.
// A prime number is a natural number greater than 1 that cannot be formed by multiplying two

import java.util.*;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter any natural number to check if it is prime or not!");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int flag = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        sc.close();

    }
}
