import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int number = sc.nextInt();

        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;

            // Check if i is divisible by any number from 2 to i-1
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
