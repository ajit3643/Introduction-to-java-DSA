import java.util.*;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        int gussedNumber;

        do {

            System.out.println("Guess the number: ");
            gussedNumber = sc.nextInt();

            if (gussedNumber < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (gussedNumber > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number.");
            }

        } while (gussedNumber != randomNumber);

        sc.close();
    }
}
